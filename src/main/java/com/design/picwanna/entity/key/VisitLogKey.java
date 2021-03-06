package com.design.picwanna.entity.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * className: VisitLogKey
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-12
 */
@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class VisitLogKey implements Serializable {
    private static final long serialVersionUID = 7935499208104916305L;
    private String userId;
    private Long picId;
    private String visitTime;
}
