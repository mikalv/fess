/*
 * Copyright 2009-2015 the CodeLibs Project and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.codelibs.fess.app.web.admin.joblog;

import java.io.Serializable;

/**
 * @author codelibs
 * @author Shunji Makino
 */
public class JobLogEditForm implements Serializable {

    private static final long serialVersionUID = 1L;

    //@IntegerType
    public int crudMode;

    //@Required(target = "confirmfromupdate,update,delete")
    //@LongType
    public String id;

    //@Required(target = "confirmfromcreate,create,confirmfromupdate,update,delete")
    public String jobName;

    //@Required(target = "confirmfromcreate,create,confirmfromupdate,update,delete")
    public String jobStatus;

    //@Required(target = "confirmfromcreate,create,confirmfromupdate,update,delete")
    public String target;

    //@Required(target = "confirmfromcreate,create,confirmfromupdate,update,delete")
    public String scriptType;

    public String scriptData;

    public String scriptResult;

    //@Required(target = "confirmfromcreate,create,confirmfromupdate,update,delete")
    //@DateType(datePattern = Constants.DEFAULT_DATETIME_FORMAT)
    public String startTime;

    //@DateType(datePattern = Constants.DEFAULT_DATETIME_FORMAT)
    public String endTime;

    public void initialize() {
        id = null;
        jobName = null;
        jobStatus = null;
        target = null;
        scriptType = null;
        scriptData = null;
        scriptResult = null;
        startTime = null;
        endTime = null;
    }
}