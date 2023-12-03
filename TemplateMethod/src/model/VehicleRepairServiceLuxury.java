package model;

public class VehicleRepairServiceLuxury extends VehicleRepairService {

	public VehicleRepairServiceLuxury(DamagedVehicle damagedVehicle) {
		super(damagedVehicle);
	}

	@Override
	protected boolean toRepair() {
		return damagedVehicle.getDamagePercentage() <= 50;
	}

}
