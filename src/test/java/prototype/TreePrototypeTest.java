package prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TreePrototypeTest {

    @Test
    @DisplayName("plastic tree 복제본 생성 후 position 비교")
    void plastic_tree_복제본_생성_테스트() {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);
        Position otherPosition = new Position(4, 8);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree otherPlasticTree = new PlasticTree(mass, height);
        otherPlasticTree.setPosition(otherPosition);

        assertThat(position).isEqualTo(plasticTree.getPosition());
        assertThat(otherPosition).isEqualTo(otherPlasticTree.getPosition());
    }
}
