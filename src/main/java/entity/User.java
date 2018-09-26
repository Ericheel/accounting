package entity;

import lombok.*;

import java.io.Serializable;

/**
 * 用户
 */
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
