package abstract_factory;

public class ElectricVehicleMotor implements Motor{
    @Override
    public void equip() {
        System.out.println("전기차용 모터가 장착되었습니다.");
    }

    @Override
    public String type() {
        return "Electric Motor";
    }
}
