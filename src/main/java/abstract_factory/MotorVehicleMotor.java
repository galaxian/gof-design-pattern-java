package abstract_factory;

public class MotorVehicleMotor implements Motor{
    @Override
    public void equip() {
        System.out.println("일반차용 모터가 장착되었습니다.");
    }
}
