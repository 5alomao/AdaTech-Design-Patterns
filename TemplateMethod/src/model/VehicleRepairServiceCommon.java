package model;

public class VehicleRepairServiceCommon extends VehicleRepairService {

	public VehicleRepairServiceCommon(DamagedVehicle damagedVehicle) {
		super(damagedVehicle);
	}

	@Override
	protected boolean toRepair() {
		return damagedVehicle.getDamagePercentage() <= 70;
	}

}
