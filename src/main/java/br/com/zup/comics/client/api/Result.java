
package br.com.zup.comics.client.api;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "digitalId",
    "title",
    "issueNumber",
    "variantDescription",
    "description",
    "modified",
    "isbn",
    "upc",
    "diamondCode",
    "ean",
    "issn",
    "format",
    "pageCount",
    "textObjects",
    "resourceURI",
    "urls",
    "series",
    "variants",
    "collections",
    "collectedIssues",
    "dates",
    "prices",
    "thumbnail",
    "images",
    "creators",
    "characters",
    "stories",
    "events"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("digitalId")
    private String digitalId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("issueNumber")
    private String issueNumber;
    @JsonProperty("variantDescription")
    private String variantDescription;
    @JsonProperty("description")
    private String description;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("diamondCode")
    private String diamondCode;
    @JsonProperty("ean")
    private String ean;
    @JsonProperty("issn")
    private String issn;
    @JsonProperty("format")
    private String format;
    @JsonProperty("pageCount")
    private String pageCount;
    @JsonProperty("textObjects")
    private List<TextObject> textObjects = null;
    @JsonProperty("resourceURI")
    private String resourceURI;
    @JsonProperty("urls")
    private List<Url> urls = null;
    @JsonProperty("series")
    private Series series;
    @JsonProperty("variants")
    private List<Variant> variants = null;
    @JsonProperty("collections")
    private List<Collection> collections = null;
    @JsonProperty("collectedIssues")
    private List<CollectedIssue> collectedIssues = null;
    @JsonProperty("dates")
    private List<Date> dates = null;
    @JsonProperty("prices")
    private List<Price> prices = null;
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("creators")
    private Creators creators;
    @JsonProperty("characters")
    private Characters characters;
    @JsonProperty("stories")
    private Stories stories;
    @JsonProperty("events")
    private Events events;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("digitalId")
    public String getDigitalId() {
        return digitalId;
    }

    @JsonProperty("digitalId")
    public void setDigitalId(String digitalId) {
        this.digitalId = digitalId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("issueNumber")
    public String getIssueNumber() {
        return issueNumber;
    }

    @JsonProperty("issueNumber")
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    @JsonProperty("variantDescription")
    public String getVariantDescription() {
        return variantDescription;
    }

    @JsonProperty("variantDescription")
    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    @JsonProperty("isbn")
    public String getIsbn() {
        return isbn;
    }

    @JsonProperty("isbn")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("diamondCode")
    public String getDiamondCode() {
        return diamondCode;
    }

    @JsonProperty("diamondCode")
    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    @JsonProperty("ean")
    public String getEan() {
        return ean;
    }

    @JsonProperty("ean")
    public void setEan(String ean) {
        this.ean = ean;
    }

    @JsonProperty("issn")
    public String getIssn() {
        return issn;
    }

    @JsonProperty("issn")
    public void setIssn(String issn) {
        this.issn = issn;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("pageCount")
    public String getPageCount() {
        return pageCount;
    }

    @JsonProperty("pageCount")
    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("textObjects")
    public List<TextObject> getTextObjects() {
        return textObjects;
    }

    @JsonProperty("textObjects")
    public void setTextObjects(List<TextObject> textObjects) {
        this.textObjects = textObjects;
    }

    @JsonProperty("resourceURI")
    public String getResourceURI() {
        return resourceURI;
    }

    @JsonProperty("resourceURI")
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    @JsonProperty("urls")
    public List<Url> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    @JsonProperty("series")
    public Series getSeries() {
        return series;
    }

    @JsonProperty("series")
    public void setSeries(Series series) {
        this.series = series;
    }

    @JsonProperty("variants")
    public List<Variant> getVariants() {
        return variants;
    }

    @JsonProperty("variants")
    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    @JsonProperty("collections")
    public List<Collection> getCollections() {
        return collections;
    }

    @JsonProperty("collections")
    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    @JsonProperty("collectedIssues")
    public List<CollectedIssue> getCollectedIssues() {
        return collectedIssues;
    }

    @JsonProperty("collectedIssues")
    public void setCollectedIssues(List<CollectedIssue> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }

    @JsonProperty("dates")
    public List<Date> getDates() {
        return dates;
    }

    @JsonProperty("dates")
    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    @JsonProperty("prices")
    public List<Price> getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    @JsonProperty("thumbnail")
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("creators")
    public Creators getCreators() {
        return creators;
    }

    @JsonProperty("creators")
    public void setCreators(Creators creators) {
        this.creators = creators;
    }

    @JsonProperty("characters")
    public Characters getCharacters() {
        return characters;
    }

    @JsonProperty("characters")
    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    @JsonProperty("stories")
    public Stories getStories() {
        return stories;
    }

    @JsonProperty("stories")
    public void setStories(Stories stories) {
        this.stories = stories;
    }

    @JsonProperty("events")
    public Events getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(Events events) {
        this.events = events;
    }

}
