package SpringbootLargestBuilding;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringbootLargestBuilding.domain.FloorArea;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/*@PostConstruct
	public void floorAreaBuilding() {
		ArrayList<FloorArea> building = new ArrayList<FloorArea>();
		
		FloorArea newCenturyGlobalCenter = new FloorArea(1, "New Century Global Center", "China", "Chengdu", 1760000, "NewCenturyGlobalCenter.png");
		building.add(newCenturyGlobalCenter);
		FloorArea dubaiInternationalAirportTerminal = new FloorArea(2, "Dubai International Airport Terminal", "United Arab Emirates", "Dubai", 1713000, "dubaiInternationalAirportTerminal.png");
		building.add(dubaiInternationalAirportTerminal);
		FloorArea abrajAlBaitEndowment = new FloorArea(3, "Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", 1575815, "AbrajAlBaitEndowment.png");
		building.add(abrajAlBaitEndowment);
		FloorArea centralWorld = new FloorArea(4, "CentralWorld", "Thailand", "Bangkok", 1024000, "CentralWorld.png");
		building.add(centralWorld);
		FloorArea aalsmeerFlowerAuction = new FloorArea(5, "Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", 990000, "AalsmeerFlowerAuction.png");
		building.add(aalsmeerFlowerAuction);
		FloorArea beijingCapitalInternationalAirportTerminal3 = new FloorArea(6, "Beijing Capital International Airport Terminal 3", "China", "Beijing", 986000, "BeijingCapitalInternationalAirportTerminal3.png");
		building.add(beijingCapitalInternationalAirportTerminal3);
		FloorArea theVenetianMacao = new FloorArea(7, "The Venetian Macao", "Macau", "Macau", 980000, "TheVenetianMacao.png");
		building.add(theVenetianMacao);
		FloorArea sandsCotaiCentral = new FloorArea(8, "Sands Cotai Central", "Macau", "Macau", 890000, "SandsCotaiCentral.png");
		building.add(sandsCotaiCentral);
		FloorArea ciputraWorldSurabaya = new FloorArea(9, "Ciputra World Surabaya", "Indonesia", "Surabaya", 750000, "CiputraWorldSurabaya.png");
		building.add(ciputraWorldSurabaya);
		FloorArea berjayaTimesSquare = new FloorArea(10, "Berjaya Times Square", "Malaysia", "Kuala Lumpar", 700000, "BerjayaTimesSquare.png");
		building.add(berjayaTimesSquare);
		
		for (FloorArea floorArea : building) {
			System.out.println(floorArea.getName());
		}
	}*/
}
