package prvi;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Product implements Serializable {

    private int productId;
    private String name;
    private String productNumber;
    private boolean makeFlag;
    private boolean finishedGoodsFlag;
    private String color;
    private int safetyStockLevel;
    private int reorderPoint;
    private double standardCost;
    private double listPrice;
    private String size;
    private String sizeUnitMeasureCode;
    private String wightUnitMeasureCode;
    private float weight;
    private int daysToManufacture;
    private String productLine;
    private String classCol;
    private String style;
    private String categoryName;
    private ProductModel productModel;
    private Date sellStartDate;
    private Date sellEndDate;
    private Date dicontinueDate;
    private byte[] rowguid;
    private Date modificationDate;


    public Product(int productId, String name, String productNumber, boolean makeFlag, boolean finishedGoodsFlag,
                   String color, int safetyStockLevel, int reorderPoint, double standardCost, double listPrice, String size,
                   String sizeUnitMeasureCode, String wightUnitMeasureCode, float weight, int daysToManufacture, String productLine,
                   String classCol, String style, String categoryName, ProductModel productModel,
                   Date sellStartDate, Date sellEndDate, Date dicontinueDate, byte[] rowguid, Date modificationDate) {
        this.productId = productId;
        this.name = name;
        this.productNumber = productNumber;
        this.makeFlag = makeFlag;
        this.finishedGoodsFlag = finishedGoodsFlag;
        this.color = color;
        this.safetyStockLevel = safetyStockLevel;
        this.reorderPoint = reorderPoint;
        this.standardCost = standardCost;
        this.listPrice = listPrice;
        this.size = size;
        this.sizeUnitMeasureCode = sizeUnitMeasureCode;
        this.wightUnitMeasureCode = wightUnitMeasureCode;
        this.weight = weight;
        this.daysToManufacture = daysToManufacture;
        this.productLine = productLine;
        this.classCol = classCol;
        this.style = style;
        this.categoryName = categoryName;
        this.productModel = productModel;
        this.sellStartDate = sellStartDate;
        this.sellEndDate = sellEndDate;
        this.dicontinueDate = dicontinueDate;
        this.rowguid = rowguid;
        this.modificationDate = modificationDate;
    }

    public Product() {
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public boolean isMakeFlag() {
        return makeFlag;
    }

    public void setMakeFlag(boolean makeFlag) {
        this.makeFlag = makeFlag;
    }

    public boolean isFinishedGoodsFlag() {
        return finishedGoodsFlag;
    }

    public void setFinishedGoodsFlag(boolean finishedGoodsFlag) {
        this.finishedGoodsFlag = finishedGoodsFlag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSafetyStockLevel() {
        return safetyStockLevel;
    }

    public void setSafetyStockLevel(int safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public int getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(int reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public double getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(double standardCost) {
        this.standardCost = standardCost;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSizeUnitMeasureCode() {
        return sizeUnitMeasureCode;
    }

    public void setSizeUnitMeasureCode(String sizeUnitMeasureCode) {
        this.sizeUnitMeasureCode = sizeUnitMeasureCode;
    }

    public String getWightUnitMeasureCode() {
        return wightUnitMeasureCode;
    }

    public void setWeghtUnitMeasureCode(String wightUnitMeasureCode) {
        this.wightUnitMeasureCode = wightUnitMeasureCode;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getDaysToManufacture() {
        return daysToManufacture;
    }

    public void setDaysToManufacture(int daysToManufacture) {
        this.daysToManufacture = daysToManufacture;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getClassCol() {
        return classCol;
    }

    public void setClassCol(String classCol) {
        this.classCol = classCol;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setWightUnitMeasureCode(String wightUnitMeasureCode) {
        this.wightUnitMeasureCode = wightUnitMeasureCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ProductModel getProductModel() {
        return productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

    public Date getSellStartDate() {
        return sellStartDate;
    }

    public void setSellStartDate(Date sellStartDate) {
        this.sellStartDate = sellStartDate;
    }

    public Date getSellEndDate() {
        return sellEndDate;
    }

    public void setSellEndDate(Date sellEndDate) {
        this.sellEndDate = sellEndDate;
    }

    public Date getDicontinueDate() {
        return dicontinueDate;
    }

    public void setDicontinueDate(Date dicontinueDate) {
        this.dicontinueDate = dicontinueDate;
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
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", makeFlag=" + makeFlag +
                ", finishedGoodsFlag=" + finishedGoodsFlag +
                ", color='" + color + '\'' +
                ", safetyStockLevel=" + safetyStockLevel +
                ", reorderPoint=" + reorderPoint +
                 "\n" +
                ", standardCost=" + standardCost +
                ", listPrice=" + listPrice +
                ", size='" + size + '\'' +
                ", sizeUnitMeasureCode='" + sizeUnitMeasureCode +
                ", wightUnitMeasureCode='" + wightUnitMeasureCode +
                ", weight=" + weight +
                ", daysToManufacture=" + daysToManufacture +
                ", productLine='" + productLine + '\'' +
                ", classCol='" + classCol + '\'' +
                 "\n" +
                ", style='" + style + '\'' +
                ", Category= " + categoryName +
                ", productModel=" + productModel +
                ", sellStartDate=" + sellStartDate +
                ", sellEndDate=" + sellEndDate +
                ", dicontinueDate=" + dicontinueDate +
                "\n" +
                ", rowguid=" + Arrays.toString(rowguid) +
                "\n" +
                ", modificationDate=" + modificationDate +
                '}' + "\n" + "\n";
    }
}
