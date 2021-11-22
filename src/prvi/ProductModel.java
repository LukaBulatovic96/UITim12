package prvi;

import java.io.Serializable;
import java.util.Date;

public class ProductModel implements Serializable {

    private int productModelId;
    private String name;
    private String catalogDescription;
    private String instruction;
    private byte[] rowguid;
    private Date modificationDate;

    public ProductModel(int productModelId, String name, String catalogDescription,
                        String instruction, byte[] rowguid, Date modificationDate) {
        this.productModelId = productModelId;
        this.name = name;
        this.catalogDescription = catalogDescription;
        this.instruction = instruction;
        this.rowguid = rowguid;
        this.modificationDate = modificationDate;
    }

    public ProductModel() {
    }

    public ProductModel(int productModelId) {
        this.productModelId = productModelId;
    }

    public int getProductModelId() {
        return productModelId;
    }

    public void setProductModelId(int productModelId) {
        this.productModelId = productModelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalogDescription() {
        return catalogDescription;
    }

    public void setCatalogDescription(String catalogDescription) {
        this.catalogDescription = catalogDescription;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public byte[] getRowguid() {
        return rowguid;
    }

    public void setRowguid(byte[] rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "productModelId=" + productModelId +
                '}';
    }
}
