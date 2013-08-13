package mx.gob.renapo.ecurp.ws.gestion.cliente;

import javax.xml.namespace.QName;

import mx.gob.renapo.ecurp.ws.gestion.cliente.DatosConsultaDetalles;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;

public class ClienteDetalleCurp {
	   public static void main(String[] args1) throws AxisFault {

	        RPCServiceClient serviceClient = new RPCServiceClient();

	        Options options = serviceClient.getOptions();

	        EndpointReference targetEPR = new EndpointReference("http://<<domion/ip:puerto>>/WebServicesGestion/services/ConsultaCurpDetalleService");
	        options.setTo(targetEPR);

	        DatosConsultaDetalles datos = new DatosConsultaDetalles();

	        datos.setCveUsuario("<<usuario>>");
	        datos.setPassword("<<password>>");

	        datos.setDireccionIp("10.10.10.10");
	        datos.setTipoTransaccion(6);


	        datos.setFechaNacimiento("18/06/2009");
	        datos.setNombre("CHARMIN");
	        datos.setPrimerApellido("HERNANDEZ INOZ");

	        // =================== Opcionales =============================
	        datos.setSegundoApellido("CHARMIN");
	        datos.setCveAlfaEntFedNac("DF");
	        datos.setSexo("M");

	        // Generate curp
	        QName opSetAlta = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "consultarCurpDetalle");

	        Object[] altaServiceArgs = new Object[] {datos };
	        Class<?>[] returnTypes = new Class[] { String.class };
	        
	        
	        Object[] response = serviceClient.invokeBlocking(opSetAlta,
	        		altaServiceArgs, returnTypes);
	        
	        String result = (String) response[0];
	        
	        if (result == null) {
	            System.out.println("Consulta Curp Detalle Service didn't initialize!");
	            return;
	        }
	        
	        // Displaying the result
	        System.out.println("Resultado Consulta Curp Detalle: consultarCurpDetalle:                : " +
	                           result);
	        
	        	        
	        //Confirm operation
	        QName optGetConfirm = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "getConfirm");

	        Object[] opGetConfirmArgs = new Object[] { getSessionID(result), "Mensaje"  };
	        
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
