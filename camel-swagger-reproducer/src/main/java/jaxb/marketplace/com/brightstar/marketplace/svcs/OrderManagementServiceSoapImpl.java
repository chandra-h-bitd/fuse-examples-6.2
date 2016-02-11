
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-02-08T12:28:13.447+05:30
 * Generated source version: 3.1.4
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderManagementService",
                      portName = "OrderManagementServiceSoap",
                      targetNamespace = "http://svcs.marketplace.brightstar.com/",
                      wsdlLocation = "file:/C:/Users/satish-s/workspace/SoapConsumeTest/src/main/resources/wsdl/marketplace.wsdl",
                      endpointInterface = "jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap")
                      
public class OrderManagementServiceSoapImpl implements OrderManagementServiceSoap {

    private static final Logger LOG = Logger.getLogger(OrderManagementServiceSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#cancelOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest  request )*
     */
    public jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse cancelOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest request) { 
        LOG.info("Executing operation cancelOrder");
        System.out.println(request);
        try {
            jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#getShipmentRate(jaxb.marketplace.com.brightstar.marketplace.svcs.MPShipmentRequest  request )*
     */
    public jaxb.marketplace.com.brightstar.marketplace.svcs.MPShipmentResponse getShipmentRate(jaxb.marketplace.com.brightstar.marketplace.svcs.MPShipmentRequest request) { 
        LOG.info("Executing operation getShipmentRate");
        System.out.println(request);
        try {
            jaxb.marketplace.com.brightstar.marketplace.svcs.MPShipmentResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#getOrdersBySearchParameters(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderSearchRequest  request )*
     */
    public jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderListResponse getOrdersBySearchParameters(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderSearchRequest request) { 
        LOG.info("Executing operation getOrdersBySearchParameters");
        System.out.println(request);
        try {
            jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderListResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#createAndConfirmOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest  request )*
     */
    public jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse createAndConfirmOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest request) { 
        LOG.info("Executing operation createAndConfirmOrder");
        System.out.println(request);
        try {
            jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#modifyOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest  request )*
     */
    public jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse modifyOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest request) { 
        LOG.info("Executing operation modifyOrder");
        System.out.println(request);
        try {
            jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#confirmOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest  request )*
     */
    public jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse confirmOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest request) { 
        LOG.info("Executing operation confirmOrder");
        System.out.println(request);
        try {
            jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#getEstimatedDates(jaxb.marketplace.com.brightstar.marketplace.svcs.MPDatesRequest  request )*
     */
    public jaxb.marketplace.com.brightstar.marketplace.svcs.MPDatesResponse getEstimatedDates(jaxb.marketplace.com.brightstar.marketplace.svcs.MPDatesRequest request) { 
        LOG.info("Executing operation getEstimatedDates");
        System.out.println(request);
        try {
            jaxb.marketplace.com.brightstar.marketplace.svcs.MPDatesResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#getSecurityToken(java.lang.String  userName ,)java.lang.String  password )*
     */
    public java.lang.String getSecurityToken(java.lang.String userName,java.lang.String password) { 
        LOG.info("Executing operation getSecurityToken");
        System.out.println(userName);
        System.out.println(password);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#createOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest  request )*
     */
    public jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse createOrder(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest request) { 
        LOG.info("Executing operation createOrder");
        System.out.println(request);
        try {
            jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see jaxb.marketplace.com.brightstar.marketplace.svcs.OrderManagementServiceSoap#getOrderByOrderID(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest  request )*
     */
    public jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse getOrderByOrderID(jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest request) { 
        LOG.info("Executing operation getOrderByOrderID");
        System.out.println(request);
        try {
            jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}