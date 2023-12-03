package model;

public abstract class VehicleRepairService {

	protected DamagedVehicle damagedVehicle;

	public VehicleRepairService(DamagedVehicle damagedVehicle) {
		this.damagedVehicle = damagedVehicle;
	}

	public void vehicleRepair() {
		workshopEntry();
		damageAnalysis();

		if (toRepair()) {
			repair();
			notifyRepairToInsurer();
		} else {
			notifyTotalLossToInsurer();
		}
	}

	protected abstract boolean toRepair();

	private void notifyTotalLossToInsurer() {
		System.out.println("Notificando perda total para seguradora.");
	}

	private void notifyRepairToInsurer() {
		System.out.println("Notificando reparo para seguradora.");
	}

	private void damageAnalysis() {
		System.out.println("Analisando danos.");
	}

	private void repair() {
		System.out.println("Reparando veículo.");
	}

	private void workshopEntry() {
		System.out.println("Veículo entrando na oficina.");
	}

}
