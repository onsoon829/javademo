package java024_lombok.part10;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor//같은 타입의 변수면 순서 바껴도 오류 나지 않는다?
public class Book {
    private String code;
    private String title;
}
