package view;

import model.DamagedVehicle;
import model.VehicleRepairServiceLuxury;
import model.VehicleRepairServiceCommon;
import model.VehicleRepairService;

public class Main {

	public static void main(String[] args) {

		DamagedVehicle luxuryVehicle = new DamagedVehicle();
		luxuryVehicle.setDamagePercentage(51);

		VehicleRepairService luxuryVehicleRepair = new VehicleRepairServiceLuxury(luxuryVehicle);

		luxuryVehicleRepair.vehicleRepair();

		System.out.println("-------------------------");

		DamagedVehicle commonVehicle = new DamagedVehicle();
		commonVehicle.setDamagePercentage(70);

		VehicleRepairService commonVehicleRepair = new VehicleRepairServiceCommon(commonVehicle);

		commonVehicleRepair.vehicleRepair();

	}

}
