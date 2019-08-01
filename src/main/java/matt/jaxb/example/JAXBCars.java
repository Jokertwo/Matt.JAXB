package matt.jaxb.example;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cars")
public class JAXBCars {

    @XmlElement(name = "car")
    private List<JAXBCar> cars;

    public void setCars(List<JAXBCar> cars) {
        this.cars = cars;
    }

    public List<JAXBCars> getCars() {
        return null;
    }

}
