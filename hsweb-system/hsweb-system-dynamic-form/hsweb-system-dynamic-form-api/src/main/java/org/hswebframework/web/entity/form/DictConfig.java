package org.hswebframework.web.entity.form;

import lombok.Getter;
import lombok.Setter;
import org.hswebframework.web.commons.bean.Bean;
import org.hswebframework.web.commons.entity.Entity;

import java.io.Serializable;

/**
 * @author zhouhao
 * @since 3.0
 */
@Setter
@Getter
public class DictConfig implements Bean {

    private static final long serialVersionUID = 2115608884837210121L;

    private String type;

    private String toField;

    private String config;

}
