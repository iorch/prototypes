package mx.gob.renapo.ecurp.ws.gestion.cliente;

import javax.xml.namespace.QName;

import mx.gob.renapo.ecurp.ws.gestion.cliente.DatosConsultaCurp;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;

public class ClienteConsultaPorCurp {
	   public static void main(String[] args1) throws AxisFault {

		   System.setProperty("javax.net.ssl.trustStore","C:/home/my_sslspace/client.keystore");
		   System.setProperty("javax.net.ssl.trustStorePassword","changeit");

	        RPCServiceClient serviceClient = new RPCServiceClient();

	        Options options = serviceClient.getOptions();

	        EndpointReference targetEPR = new EndpointReference("http://<<domion/ip:puerto>>/WebServicesGestion/services/ConsultaPorCurpService");

	        options.setTo(targetEPR);

	        DatosConsultaCurp datos = new DatosConsultaCurp();

		datos.setTipoTransaccion(1);
            
            
		datos.setUsuario("<<usuario>>");
		datos.setPassword("<<password>>");
            
            
		datos.setDireccionIp("1.1.1.1");

		datos.setCveCurp("DUMA940630HJCXNR14");
		datos.setCveEntidadEmisora("1");


	        // Generate curp
	        QName opSetAlta = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "consultarPorCurp"); //urn:ConsultaCurpService

	        Object[] altaServiceArgs = new Object[] {datos };
	        Class<?>[] returnTypes = new Class[] { String.class };
	        
	        
	        Object[] response = serviceClient.invokeBlocking(opSetAlta,
	        		altaServiceArgs, returnTypes);
	        
	        String result = (String) response[0];
	        
	        if (result == null) {
	            System.out.println("Consulta Curp Service didn't initialize!");
	            return;
	        }
	        
	        // Displaying the result
	        System.out.println("Resultado Consulta Curp por Curp: consultarPorCurp:                : " +
	                           result);
	        
	                
	        //Confirm operation
	        QName optGetConfirm = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "getConfirm");

	        Object[] opGetConfirmArgs = new Object[] {  getSessionID(result), "OK"  };
	        
	        serviceClient.invokeRobust(optGetConfirm, opGetConfirmArgs);
	        
	        System.out.println("Operacion Confirmada. ");
	        
	    }

    private static String getSessionID(String xml) {
        String sessionID = "";

        try {
            Document doc = DocumentHelper.parseText(xml);
            Attribute attr = doc.getRootElement().attribute("SessionID");
            sessionID = attr.getText();
        } catch (Exception ignoredException) {
        }

        return sessionID;
    }	        

}

