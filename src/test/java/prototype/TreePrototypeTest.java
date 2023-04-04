package prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @Test
    @DisplayName("pine tree 복제본 생성 후 position 비교")
    void pine_tree_복제본_생성_테스트() {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);
        Position otherPosition = new Position(4, 8);

        PineTree pineTree = new PineTree(mass, height);
        pineTree.setPosition(position);
        PineTree otherPineTree = new PineTree(mass, height);
        otherPineTree.setPosition(otherPosition);

        assertThat(position).isEqualTo(pineTree.getPosition());
        assertThat(otherPosition).isEqualTo(otherPineTree.getPosition());
    }

    @Test
    @DisplayName("tree 리스트 생성 후 리스트 복제 테스트")
    void tree_리스트_생성_후_리스트_복제_테스트() {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);
        Position otherPosition = new Position(4, 8);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PineTree pineTree = new PineTree(mass, height);
        pineTree.setPosition(otherPosition);

        List<Tree> trees = Arrays.asList(plasticTree, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::copy).collect(Collectors.toList());

        Tree plasticTreeClone = treeClones.get(0);

        assertThat(mass).isEqualTo(plasticTreeClone.getMass());
        assertThat(height).isEqualTo(plasticTree.getHeight());
        assertThat(position).isEqualTo(plasticTree.getPosition());
    }
}
