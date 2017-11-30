package SpringbootLargestBuilding.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import SpringbootLargestBuilding.domain.FloorArea;
import SpringbootLargestBuilding.domain.Footprint;
import SpringbootLargestBuilding.domain.Volume;

@Service
public class LargeBuildingService {

	private ArrayList<FloorArea> floorAreaBuilding;
	
	public LargeBuildingService() {
		
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
	
	public ArrayList<Footprint> footprintBuilding(){
		ArrayList<Footprint> building = new ArrayList<Footprint>();
		
		Footprint aalsmeerFlowerAuction = new Footprint(1, "Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "518,000m\u00B2", "AalsmeerFlowerAuction.png");
		building.add(aalsmeerFlowerAuction);
		Footprint mallOfDubai = new Footprint(2, "Mall of Dubai", "United Arab Emirates", "Dubai", "500,000m\u00B2", "MallOfDubai.png");
		building.add(mallOfDubai);
		Footprint teslaFactory = new Footprint(3, "Tesla Factory", "United States", "Fremont, California", "427,354m\u00B2", "TeslaFactory.png");
		building.add(teslaFactory);
		Footprint boeingEverettFactory = new Footprint(4, "Boeing Everett Factory", "United States", "Everett, Washington", "398,000m\u00B2", "BoeingEverettFactory.png");
		building.add(boeingEverettFactory);
		Footprint michelinDistributionCenter = new Footprint(5, "Michelin Distribution Center", "United States", "Spartanburg, South Carolina", "371,612m\u00B2", "MichelinDistributionCenter.png");
		building.add(michelinDistributionCenter);
		Footprint greatMosqueOfMecca = new Footprint(6, "Great Mosque of Mecca", "Saudi Arabia", "Hijaz", "356,000m\u00B2", "GreatMosqueOfMecca.png");
		building.add(greatMosqueOfMecca);
		Footprint nikeNorthAmericaLogisticsCenter = new Footprint(7, "Nike - North America Logistics Center", "United States", "Memphis, Tennessee", "260,000m\u00B2", "NikeNorthAmericaLogisticsCenter.png");
		building.add(nikeNorthAmericaLogisticsCenter);
		Footprint johnDeereNorthAmericanPartsDistributionCenter = new Footprint(8, "John Deere North American Parts Distribution Center", "United States", "Milan, Illinois", "246,000m\u00B2", "JohnDeereNorthAmericanPartsDistributionCenter.png");
		building.add(johnDeereNorthAmericanPartsDistributionCenter);
		Footprint mitsubishiMotorsNorthAmerica = new Footprint(9, "Mitsubishi Motors North America", "United States", "Normal, Illinois", "220,000m\u00B2", "MitsubishiMotorsNorthAmerica.png");
		building.add(mitsubishiMotorsNorthAmerica);
		Footprint indonesiaConventionExhibition = new Footprint(10, "Indonesia Convention Exhibition", "Indonesia", "Bumi Serpong Damai", "220,000m\u00B2", "IndonesiaConventionExhibition.png");
		building.add(indonesiaConventionExhibition);
		
		return building;
	}
	
	public ArrayList<Volume> volumeBuilding(){
		ArrayList<Volume> building = new ArrayList<Volume>();
		
		Volume boeingEverettFactory = new Volume(1, "Boeing Everett Factory", "United States", "Everett, Washington", "398,000m\u00B2", "13.3 million m\u00B3", "BoeingEverettFactory.png");
		building.add(boeingEverettFactory);
		Volume greatMosqueOfMecca = new Volume(2, "Great Mosque of Mecca", "Saudi Arabia", "Hijaz", "356,000m\u00B2", "8 million m\u00B3", "GreatMosqueOfMecca.png");
		building.add(greatMosqueOfMecca);
		Volume jeanLucLagarderePlant = new Volume(3, "Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", "122,500m\u00B2", "5.6 million m\u00B3", "JeanLucLagarderePlant.png");
		building.add(jeanLucLagarderePlant);
		Volume boeingCompositeWingCenter = new Volume(4, "Boeing Composite Wing Center", "United States", "Everett, Washington", "111,500m\u00B2", "3.7 million m\u00B3", "BoeingCompositeWingCenter.png");
		building.add(boeingCompositeWingCenter);
		Volume aerium = new Volume(5, "Aerium", "Germany", "Halbe, Brandenbury", "70,000m\u00B2", "5.2 million m\u00B3", "Aerium.png");
		building.add(aerium);
		Volume meyerWeftDockhalle2 = new Volume(6, "Meyer Weft Dockhalle 2", "Germany", "Papenburg, Niedersachsen", "63,000m\u00B2", "4.72 million m\u00B3", "MeyerWeftDockhalle2.png");
		building.add(meyerWeftDockhalle2);
		Volume nasaVehicleAssemblyBuilding = new Volume(7, "Nasa Vehicle Assembly Building", "United States", "Brevard County, Florida", "32,374m\u00B2", "3.66 million m\u00B3", "NasaVehicleAssemblyBuilding.png");
		building.add(nasaVehicleAssemblyBuilding);
		Volume theO2 = new Volume(8, "The O2", "United Kingdom", "London", "104,634m\u00B2", "2.79 million m\u00B3", "TheO2.png");
		building.add(theO2);
		Volume tescoIrelandDistributionCentre = new Volume(9, "Tesco Ireland Distribution Centre", "Ireland", "Donabate, Fingal", "80,194m\u00B2", "1.55 million m\u00B3", "TescoIrelandDistributionCentre.png");
		building.add(tescoIrelandDistributionCentre);
		Volume targetImportWarehouse = new Volume(10, "Target Import Warehouse", "United States", "Savannah, Georgia", "187,664m\u00B2", "1.5 million m\u00B3", "TargetImportWarehouse.png");
		building.add(targetImportWarehouse);
		
		return building;
	}
	
}
