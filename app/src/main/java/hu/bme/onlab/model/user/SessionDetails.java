/**
 * ServiceFinder API
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package hu.bme.onlab.model.user;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SessionDetails  {
  
  @SerializedName("remoteAddress")
  private String remoteAddress = null;
  @SerializedName("sessionId")
  private String sessionId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRemoteAddress() {
    return remoteAddress;
  }
  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionDetails sessionDetails = (SessionDetails) o;
    return (remoteAddress == null ? sessionDetails.remoteAddress == null : remoteAddress.equals(sessionDetails.remoteAddress)) &&
        (sessionId == null ? sessionDetails.sessionId == null : sessionId.equals(sessionDetails.sessionId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (remoteAddress == null ? 0: remoteAddress.hashCode());
    result = 31 * result + (sessionId == null ? 0: sessionId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionDetails {\n");
    
    sb.append("  remoteAddress: ").append(remoteAddress).append("\n");
    sb.append("  sessionId: ").append(sessionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
