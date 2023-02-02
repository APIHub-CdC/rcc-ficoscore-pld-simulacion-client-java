package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.test;

import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.CatalogoEstados;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.DomicilioPeticion;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.ApiClient;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.ApiException;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.api.RCCFSPLDApi;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.PersonaPeticion;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.Respuesta;
import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class ApiTest {

	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private final RCCFSPLDApi api = new RCCFSPLDApi();
	private ApiClient apiClient = null;
    private String xApiKey = "your_api_key";
    private String url = "the_url";

    @Before()
    public void setUp() {
        this.apiClient = api.getApiClient();
         this.apiClient.setBasePath(url);
         OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
         apiClient.setHttpClient(okHttpClient);
    }
    
	@Test
	public void getReporteTest() throws ApiException {

		Boolean xFullReport = false;

		PersonaPeticion persona = new PersonaPeticion();
		DomicilioPeticion domicilio = new DomicilioPeticion();
		try {
			persona.setApellidoPaterno("SESENTAYDOS");
			persona.setApellidoMaterno("PRUEBA");
			persona.setApellidoAdicional(null);
			persona.setPrimerNombre("JUAN");
			persona.setSegundoNombre(null);
			persona.setFechaNacimiento("1965-08-09");
			persona.setRFC("SEPJ650809JG1");
			persona.setCURP(null);
			persona.setNacionalidad("MX");
			persona.setResidencia(null);
			persona.setEstadoCivil(null);
			persona.setSexo(null);
			persona.setClaveElectorIFE(null);
			persona.setNumeroDependientes(null);
			persona.setFechaDefuncion(null);
			persona.setDomicilio(null);

			domicilio.setDireccion("PASADISO ENCONTRADO 58");
			domicilio.setColoniaPoblacion("MONTEVIDEO");
			domicilio.setDelegacionMunicipio("GUSTAVO A MADERO");
			domicilio.setCiudad("CIUDAD DE MÉXICO");
			domicilio.setEstado(CatalogoEstados.CDMX);
			domicilio.setCP("07730");
			domicilio.setFechaResidencia(null);
			domicilio.setNumeroTelefono(null);
			domicilio.setTipoDomicilio(null);
			domicilio.setTipoAsentamiento(null);

			persona.setDomicilio(domicilio);

			Respuesta response = api.getReporte(xApiKey, persona, xFullReport);

			Assert.assertTrue(response.getFolioConsulta() != null);
			logger.info(response.toString());

		} catch (ApiException e) {
			logger.error(e.getResponseBody());
		}

	}

}