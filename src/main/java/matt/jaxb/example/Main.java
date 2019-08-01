package matt.jaxb.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main() {
        JAXBCar car = new JAXBCar("fiat", "punto", "blue", 1);
        List<JAXBCar> carList = new ArrayList<>();
        carList.add(car);

        JAXBCars cars = new JAXBCars();
        cars.setCars(carList);

        try {
            JAXBCars jaxbCars = load(this.getClass().getResourceAsStream("/Cars.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        try {
            save("", cars);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }


    private JAXBCars load(InputStream is) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(JAXBCars.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBCars cars = (JAXBCars) unmarshaller.unmarshal(is);
        return cars;
    }

    private void save(String path, JAXBCars cars) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(JAXBCars.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        // output pretty printed
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(cars, System.out);
    }

    public static void main(String[] args) {
        new Main();
    }
}
