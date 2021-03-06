/*
 *     Copyright 2016-2026 TinyZ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ogcs.okra.example.game.business;

/**
 * @author TinyZ
 * @date 2016-09-26.
 */
public class BusConfig {
    public long uid;               // 隐藏字段 -   redisKey
    public int busId;              // bus唯一ID    -     hashKey
    public long busTemplateId;      //  模板Id
    public String busTemplate;        //  动态模板    -   json字符串     -   结构类似于BusinessConfig中的静态模板和全局模板
    public long timeStart;          //  开始日期时间(时间戳)
    public long timeEnd;            //  结束日期时间(时间戳)
    public long expire = -1;        //  过期时间(单位: 秒)
    public int[] weekdays;           //  生效星期 [周日(0), .... 周六(7)]
    public long beginTime;          //  每日生效开始时间    [ '24:00:00' ]
    public long overTime;           //  每日生效结束时间    [ '00:00:00' ]
}
