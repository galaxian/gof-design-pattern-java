package abstract_factory;

public class MotorVehicleWheel implements Wheel {
    @Override
    public void equip() {
        System.out.println("일반차용 바퀴가 장착되었습니다.");
    }

    @Override
    public String type() {
        return "Wheel";
    }
}
