/*
 * Copyright 2022 DroidconKE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android254.data.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ORGANIZERS")
class OrganizerEntity(
    @PrimaryKey(autoGenerate = false)
    var id: Int,
    var name: String?,
    var email: String?,
    var description: String?,
    var facebook: String?,
    var twitter: String?,
    var instagram: String?,
    var logo: String?,
    var slug: String?,
    var status: String?,
    var createdAt: String?,
    var creater: CreatorEntity?,
    var upcomingEventsCount: Int?,
    var totalEventsCount: Int?
) {

    class CreatorEntity(
        val id: Int?,
        val name: String?,
        val email: String?,
        val createdAt: String?
    )
}