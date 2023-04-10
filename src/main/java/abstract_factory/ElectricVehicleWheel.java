package abstract_factory;

public class ElectricVehicleWheel implements Wheel{
    @Override
    public void equip() {
        System.out.println("전기차용 바퀴가 장착되었습니다.");
    }
}
