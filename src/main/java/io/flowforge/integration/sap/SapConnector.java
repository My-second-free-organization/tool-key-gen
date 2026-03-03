package io.flowforge.integration.sap;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class SapConnector {
    private static final Logger log = LoggerFactory.getLogger(SapConnector.class);
    public void readMaterialMaster(String materialId) { log.info("Reading material: {}", materialId); }
    public void createPurchaseOrder(String vendor, String material) { log.info("Creating PO for {} - {}", vendor, material); }
    public void syncBusinessPartners() { log.info("Syncing business partners from SAP"); }
}
