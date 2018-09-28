package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

/**
 * 记录 实体类
 *
 * @author ericheel
 */
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Accounting {
    private Integer aid;
    private Integer uid;
    private Integer budgetType;
    private Integer bigType;
    private String bigDetail;
    private Double money;
    private String remark;
    private Date aTime;
}
