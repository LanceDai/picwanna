package com.design.picwanna.entity.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * className: AttitudeKey
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
public class AttitudeKey implements Serializable {
    private static final long serialVersionUID = 7935499208104916305L;

    private String userId;

    private Long picId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AttitudeKey that = (AttitudeKey) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) {
            return false;
        }
        return picId != null ? picId.equals(that.picId) : that.picId == null;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (picId != null ? picId.hashCode() : 0);
        return result;
    }
}
