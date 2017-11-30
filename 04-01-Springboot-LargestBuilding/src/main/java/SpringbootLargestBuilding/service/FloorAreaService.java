package SpringbootLargestBuilding.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import SpringbootLargestBuilding.domain.FloorArea;

@Service
public class FloorAreaService {

	private ArrayList<FloorArea> floorAreaBuilding;
	
	public FloorAreaService() {
		
	}
	
	public ArrayList<FloorArea> floorAreaBuilding() {
		ArrayList<FloorArea> building = new ArrayList<FloorArea>();
		
		FloorArea newCenturyGlobalCenter = new FloorArea(1, "New Century Global Center", "China", "Chengdu", "1,760,000m\u00B2", "NewCenturyGlobalCenter.png");
		building.add(newCenturyGlobalCenter);
		FloorArea dubaiInternationalAirportTerminal = new FloorArea(2, "Dubai International Airport Terminal", "United Arab Emirates", "Dubai", "1,713,000m\u00B2", "DubaiInternationalAirportTerminal3.png");
		building.add(dubaiInternationalAirportTerminal);
		FloorArea abrajAlBaitEndowment = new FloorArea(3, "Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "1,575,815m\u00B2", "AbrajAlBaitEndowment.png");
		building.add(abrajAlBaitEndowment);
		FloorArea centralWorld = new FloorArea(4, "CentralWorld", "Thailand", "Bangkok", "1,024,000m\u00B2", "CentralWorld.png");
		building.add(centralWorld);
		FloorArea aalsmeerFlowerAuction = new FloorArea(5, "Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "990,000m\u00B2", "AalsmeerFlowerAuction.png");
		building.add(aalsmeerFlowerAuction);
		FloorArea beijingCapitalInternationalAirportTerminal3 = new FloorArea(6, "Beijing Capital International Airport Terminal 3", "China", "Beijing", "986,000m\u00B2", "BeijingCapitalInternationalAirportTerminal3.png");
		building.add(beijingCapitalInternationalAirportTerminal3);
		FloorArea theVenetianMacao = new FloorArea(7, "The Venetian Macao", "Macau", "Macau", "980,000m\u00B2", "TheVenetianMacao.png");
		building.add(theVenetianMacao);
		FloorArea sandsCotaiCentral = new FloorArea(8, "Sands Cotai Central", "Macau", "Macau", "890,000m\u00B2", "SandsCotaiCentral.png");
		building.add(sandsCotaiCentral);
		FloorArea ciputraWorldSurabaya = new FloorArea(9, "Ciputra World Surabaya", "Indonesia", "Surabaya", "750,000m\u00B2", "CiputraWorldSurabaya.png");
		building.add(ciputraWorldSurabaya);
		FloorArea berjayaTimesSquare = new FloorArea(10, "Berjaya Times Square", "Malaysia", "Kuala Lumpar", "700,000m\u00B2", "BerjayaTimesSquare.png");
		building.add(berjayaTimesSquare);
		
		return building;
	}
}
