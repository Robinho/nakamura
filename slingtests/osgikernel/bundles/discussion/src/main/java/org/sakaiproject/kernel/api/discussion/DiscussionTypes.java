/*
 * Licensed to the Sakai Foundation (SF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The SF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.sakaiproject.kernel.api.discussion;

public enum DiscussionTypes {
  discussion, comment;

  // TODO: IMHO, hasValue should not do things like this. We have an enum, and we are
  // encouraging abuse of the enum since Discssion DiScUsSiOn are all ok, but wont be
  // searchable, and can't be coerced into the DiscussionType I would rather using     
  // DiscussionTypes.valueOf(string) and catch 
  // the InvalidArgumentException 

  
  public static boolean hasValue(String s) {
    DiscussionTypes[] types = values();
    for (DiscussionTypes t : types) {
      if (t.name().equalsIgnoreCase(s)) {
        return true;
      }
    }
    return false;
  }
}
