# Simulación del Reporte de Crédito Consolidado con FICO® Score y Prevención de Lavado de Dinero

Simula el reporta del historial crediticio; el cumplimiento de pago de los compromisos que la persona ha adquirido con entidades financieras, no financieras e instituciones comerciales que dan crédito o participan en actividades afines al crédito; y filtra contra listas de cumplimiento para Prevención de Lavado de Dinero.

## Requisitos

1. Java >= 1.7
2. Maven >= 3.3

## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:

```shell
mvn install -Dmaven.test.skip=true
```

> **NOTA:** Este fragmento del comando *-Dmaven.test.skip=true* evitará que se lance la prueba unitaria.


## Guía de inicio

### Paso 1. Agregar el producto a la aplicación

Al iniciar sesión seguir os siguientes pasos:

 1. Dar clic en la sección "**Mis aplicaciones**".
 2. Seleccionar la aplicación.
 3. Ir a la pestaña de "**Editar '@tuApp**' ".
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/edit_applications.jpg" width="900">
    </p>
 4. Al abrirse la ventana emergente, seleccionar el producto.
 5. Dar clic en el botón "**Guardar App**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/selected_product.jpg" width="400">
    </p>

### Paso 2. Capturar los datos de la petición

Los siguientes datos a modificar se encuentran en ***src/test/java/ApiTest.java***

Es importante contar con el setUp() que se encargará de inicializar la url. Modificar la URL ***('the_url')***, como se muestra en el siguiente fragmento de código:

```java
@Before()
public void setUp() {
	this.apiClient = api.getApiClient();
	this.apiClient.setBasePath("the_url");
	OkHttpClient okHttpClient = new OkHttpClient()
		.newBuilder()
		.readTimeout(30, TimeUnit.SECONDS)
		.build();
	apiClient.setHttpClient(okHttpClient);
}
```

En el archivo **ApiTest**, que se encuentra en ***src/test/java/io/ApiTest/client/api*** se deberá modificar el siguiente fragmento de código con los datos correspondientes:

```java
@Test
public void getReporteTest() throws ApiException {

	String xApiKey = "your_api_key";
	Boolean xFullReport = false;

	PersonaPeticion persona = new PersonaPeticion();
	DomicilioPeticion domicilio = new DomicilioPeticion();
	try {
		persona.setApellidoPaterno("ROBERTO");
		persona.setApellidoMaterno("SAHAGUN");
		persona.setApellidoAdicional(null);
		persona.setPrimerNombre("ZARAGOZA");
		persona.setSegundoNombre(null);
		persona.setFechaNacimiento("2001-01-01");
		persona.setRFC("SAZR010101");
		persona.setCURP(null);
		persona.setNacionalidad("MX");
		persona.setResidencia(null);
		persona.setEstadoCivil(null);
		persona.setSexo(null);
		persona.setClaveElectorIFE(null);
		persona.setNumeroDependientes(null);
		persona.setFechaDefuncion(null);
		persona.setDomicilio(null);

		domicilio.setDireccion("HIDALGO 32");
		domicilio.setColoniaPoblacion("CENTRO");
		domicilio.setDelegacionMunicipio("LA BARCA");
		domicilio.setCiudad("BENITO JUAREZ");
		domicilio.setEstado(CatalogoEstados.JAL);
		domicilio.setCP("47917");
		domicilio.setFechaResidencia(null);
		domicilio.setNumeroTelefono(null);
		domicilio.setTipoDomicilio(null);
		domicilio.setTipoAsentamiento(null);

		persona.setDomicilio(domicilio);

		Respuesta response = api.getReporte(xApiKey, persona, xFullReport);

		Assert.assertTrue(response.getFolioConsulta() != null);
		logger.info(response.toString());

		if (response.getFolioConsulta() != null && !xFullReport) {
			String folioConsulta = response.getFolioConsulta();

			Consultas consultas = api.getConsultas(folioConsulta, xApiKey);
			Assert.assertTrue(consultas.getConsultas() != null);
			logger.info(consultas.toString());

			Creditos creditos = api.getCreditos(folioConsulta, xApiKey);
			Assert.assertTrue(creditos.getCreditos() != null);
			logger.info(creditos.toString());

			DomiciliosRespuesta domicilios = api.getDomicilios(folioConsulta, xApiKey);
			Assert.assertTrue(domicilios.getDomicilios() != null);
			logger.info(domicilios.toString());

			Empleos empleos = api.getEmpleos(folioConsulta, xApiKey);
			Assert.assertTrue(empleos.getEmpleos() != null);
			logger.info(empleos.toString());

			Scores scores = api.getScores(folioConsulta, xApiKey);
			Assert.assertTrue(scores.getScores() != null);
			logger.info(scores.toString());

			Mensajes mensajes = api.getMensajes(folioConsulta, xApiKey);
			Assert.assertTrue(mensajes.getMensajes() != null);
			logger.info(mensajes.toString());
		}
	} catch (ApiException e) {
		logger.error(e.getResponseBody());
	}

}
```

### Paso 3. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```
