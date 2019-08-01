package matt.jaxb.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "car")
public class JAXBCar {

    @XmlAttribute(name = "brand")
    private String brand;

    @XmlElement(name = "model")
    private String model;

    @XmlElement(name = "color")
    private String color;

    @XmlElement(name = "count")
    private int count;

    //this is necessary for jaxb
    public JAXBCar() {
    }

    public JAXBCar(String brand, String model, String color, int count) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.count = count;
    }

    public String getBrand() {
        return null;
    }

    public String getModel() {
        return null;
    }

    public String getColor() {
        return null;
    }
}
