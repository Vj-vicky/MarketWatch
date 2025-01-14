package in.codifi.mw.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndexModel implements Serializable {
	@JsonProperty("closingIndex")
	private String closingIndex;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("segment")
	private String segment;
	@JsonProperty("indexName")
	private String indexName;
	@JsonProperty("indexValue")
	private String indexValue;
	@JsonProperty("indiceID")
	private String indiceID;
}
