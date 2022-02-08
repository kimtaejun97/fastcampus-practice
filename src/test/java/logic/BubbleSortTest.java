package logic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private final BubbleSort<Integer> bubbleSort = new BubbleSort<>();

    @DisplayName("리스트가 들어오면 정렬된 리스트를 반환한다.")
    @Test
    void givenList_whenSorting_thenReturnSortedList() {
        // given
        final List<Integer> input = List.of(5,3,1,4,6,2);

        // when
        final List<Integer> output = bubbleSort.sort(input);

        // then
        assertThat(output).isEqualTo(List.of(1,2,3,4,5,6));
    }
}
