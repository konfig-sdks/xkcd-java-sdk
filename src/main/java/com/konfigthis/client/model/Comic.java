/*
 * XKCD
 * Webcomic of romance, sarcasm, math, and language.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Comic
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Comic {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ALT = "alt";
  @SerializedName(SERIALIZED_NAME_ALT)
  private String alt;

  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private String day;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private String month;

  public static final String SERIALIZED_NAME_NEWS = "news";
  @SerializedName(SERIALIZED_NAME_NEWS)
  private String news;

  public static final String SERIALIZED_NAME_NUM = "num";
  @SerializedName(SERIALIZED_NAME_NUM)
  private Double num;

  public static final String SERIALIZED_NAME_SAFE_TITLE = "safe_title";
  @SerializedName(SERIALIZED_NAME_SAFE_TITLE)
  private String safeTitle;

  public static final String SERIALIZED_NAME_TRANSCRIPT = "transcript";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPT)
  private String transcript;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;

  public Comic() {
  }

  public Comic title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public Comic alt(String alt) {
    
    
    
    
    this.alt = alt;
    return this;
  }

   /**
   * Get alt
   * @return alt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlt() {
    return alt;
  }


  public void setAlt(String alt) {
    
    
    
    this.alt = alt;
  }


  public Comic day(String day) {
    
    
    
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDay() {
    return day;
  }


  public void setDay(String day) {
    
    
    
    this.day = day;
  }


  public Comic img(String img) {
    
    
    
    
    this.img = img;
    return this;
  }

   /**
   * Get img
   * @return img
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImg() {
    return img;
  }


  public void setImg(String img) {
    
    
    
    this.img = img;
  }


  public Comic link(String link) {
    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    
    
    
    this.link = link;
  }


  public Comic month(String month) {
    
    
    
    
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMonth() {
    return month;
  }


  public void setMonth(String month) {
    
    
    
    this.month = month;
  }


  public Comic news(String news) {
    
    
    
    
    this.news = news;
    return this;
  }

   /**
   * Get news
   * @return news
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNews() {
    return news;
  }


  public void setNews(String news) {
    
    
    
    this.news = news;
  }


  public Comic num(Double num) {
    
    
    
    
    this.num = num;
    return this;
  }

  public Comic num(Integer num) {
    
    
    
    
    this.num = num.doubleValue();
    return this;
  }

   /**
   * Get num
   * @return num
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getNum() {
    return num;
  }


  public void setNum(Double num) {
    
    
    
    this.num = num;
  }


  public Comic safeTitle(String safeTitle) {
    
    
    
    
    this.safeTitle = safeTitle;
    return this;
  }

   /**
   * Get safeTitle
   * @return safeTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSafeTitle() {
    return safeTitle;
  }


  public void setSafeTitle(String safeTitle) {
    
    
    
    this.safeTitle = safeTitle;
  }


  public Comic transcript(String transcript) {
    
    
    
    
    this.transcript = transcript;
    return this;
  }

   /**
   * Get transcript
   * @return transcript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTranscript() {
    return transcript;
  }


  public void setTranscript(String transcript) {
    
    
    
    this.transcript = transcript;
  }


  public Comic year(String year) {
    
    
    
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    
    
    
    this.year = year;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Comic instance itself
   */
  public Comic putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comic comic = (Comic) o;
    return Objects.equals(this.title, comic.title) &&
        Objects.equals(this.alt, comic.alt) &&
        Objects.equals(this.day, comic.day) &&
        Objects.equals(this.img, comic.img) &&
        Objects.equals(this.link, comic.link) &&
        Objects.equals(this.month, comic.month) &&
        Objects.equals(this.news, comic.news) &&
        Objects.equals(this.num, comic.num) &&
        Objects.equals(this.safeTitle, comic.safeTitle) &&
        Objects.equals(this.transcript, comic.transcript) &&
        Objects.equals(this.year, comic.year)&&
        Objects.equals(this.additionalProperties, comic.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, alt, day, img, link, month, news, num, safeTitle, transcript, year, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comic {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    news: ").append(toIndentedString(news)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
    sb.append("    safeTitle: ").append(toIndentedString(safeTitle)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("title");
    openapiFields.add("alt");
    openapiFields.add("day");
    openapiFields.add("img");
    openapiFields.add("link");
    openapiFields.add("month");
    openapiFields.add("news");
    openapiFields.add("num");
    openapiFields.add("safe_title");
    openapiFields.add("transcript");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Comic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Comic.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Comic is not found in the empty JSON string", Comic.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("alt") != null && !jsonObj.get("alt").isJsonNull()) && !jsonObj.get("alt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alt").toString()));
      }
      if ((jsonObj.get("day") != null && !jsonObj.get("day").isJsonNull()) && !jsonObj.get("day").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `day` to be a primitive type in the JSON string but got `%s`", jsonObj.get("day").toString()));
      }
      if ((jsonObj.get("img") != null && !jsonObj.get("img").isJsonNull()) && !jsonObj.get("img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("img").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("month") != null && !jsonObj.get("month").isJsonNull()) && !jsonObj.get("month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("month").toString()));
      }
      if ((jsonObj.get("news") != null && !jsonObj.get("news").isJsonNull()) && !jsonObj.get("news").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `news` to be a primitive type in the JSON string but got `%s`", jsonObj.get("news").toString()));
      }
      if ((jsonObj.get("safe_title") != null && !jsonObj.get("safe_title").isJsonNull()) && !jsonObj.get("safe_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `safe_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("safe_title").toString()));
      }
      if ((jsonObj.get("transcript") != null && !jsonObj.get("transcript").isJsonNull()) && !jsonObj.get("transcript").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transcript` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transcript").toString()));
      }
      if ((jsonObj.get("year") != null && !jsonObj.get("year").isJsonNull()) && !jsonObj.get("year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("year").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Comic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Comic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Comic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Comic.class));

       return (TypeAdapter<T>) new TypeAdapter<Comic>() {
           @Override
           public void write(JsonWriter out, Comic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Comic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Comic instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Comic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Comic
  * @throws IOException if the JSON string is invalid with respect to Comic
  */
  public static Comic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Comic.class);
  }

 /**
  * Convert an instance of Comic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
