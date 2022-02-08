package logic;

import java.util.List;

/**
 * 정렬 기능을 제공하느 인터페이스. {@link Comparable} 을 구현해야 한다.
 * @param <T>
 */

public interface Sort<T extends Comparable<T>> {

    /**
     * 정렬을 수행한다. 오름차순 만을 지원한다.
     * @param list
     * @return
     */
    List<T> sort(List<T> list);
}
