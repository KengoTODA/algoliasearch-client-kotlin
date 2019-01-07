package serialize

import com.algolia.search.saas.serialize.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import shouldEqual


@RunWith(JUnit4::class)
internal class TestKeys {

    @Test
    fun keys() {
        KeyQuery shouldEqual "query"
        KeySearchableAttributes shouldEqual "searchableAttributes"
        KeyAttributesForFaceting shouldEqual "attributesForFaceting"
        KeyUnretrievableAttributes shouldEqual "unretrievableAttributes"
        KeyAttributesToRetrieve shouldEqual "attributesToRetrieve"
        KeyRestrictSearchableAttributes shouldEqual "restrictSearchableAttributes"
        KeyRanking shouldEqual "ranking"
        KeyCustomRanking shouldEqual "customRanking"
        KeyReplicas shouldEqual "replicas"
        KeyFilters shouldEqual "filters"
        KeyFacetFilters shouldEqual "facetFilters"
        KeyOptionalFilters shouldEqual "optionalFilters"
        KeyNumericFilters shouldEqual "numericFilters"
        KeyTagFilters shouldEqual "tagFilters"
        KeySumOrFiltersScores shouldEqual "sumOrFiltersScores"
        KeyFacets shouldEqual "facets"
        KeyMaxValuesPerFacet shouldEqual "maxValuesPerFacet"
        KeyFacetingAfterDistinct shouldEqual "facetingAfterDistinct"
        KeySortFacetValuesBy shouldEqual "sortFacetValuesBy"
        KeyAttributesToHighlight shouldEqual "attributesToHighlight"
        KeyAttributesToSnippet shouldEqual "attributesToSnippet"
        KeyHighlightPreTag shouldEqual "highlightPreTag"
        KeyHighlightPostTag shouldEqual "highlightPostTag"
        KeySnippetEllipsisText shouldEqual "snippetEllipsisText"
        KeyRestrictHighlightAndSnippetArrays shouldEqual "restrictHighlightAndSnippetArrays"
        KeyPage shouldEqual "page"
        KeyHitsPerPage shouldEqual "hitsPerPage"
        KeyOffset shouldEqual "offset"
        KeyLength shouldEqual "length"
        KeyPaginationLimitedTo shouldEqual "paginationLimitedTo"
        KeyMinWordSizefor1Typo shouldEqual "minWordSizefor1Typo"
        KeyMinWordSizefor2Typos shouldEqual "minWordSizefor2Typos"
        KeyTypoTolerance shouldEqual "typoTolerance"
        KeyAllowTyposOnNumericTokens shouldEqual "allowTyposOnNumericTokens"
        KeyDisableTypoToleranceOnAttributes shouldEqual "disableTypoToleranceOnAttributes"
        KeyDisableTypoToleranceOnWords shouldEqual "disableTypoToleranceOnWords"
        KeySeparatorsToIndex shouldEqual "separatorsToIndex"
        KeyAroundLatLng shouldEqual "aroundLatLng"
        KeyAroundLatLngViaIP shouldEqual "aroundLatLngViaIP"
        KeyAroundRadius shouldEqual "aroundRadius"
        KeyAroundPrecision shouldEqual "aroundPrecision"
        KeyMinimumAroundRadius shouldEqual "minimumAroundRadius"
        KeyInsideBoundingBox shouldEqual "insideBoundingBox"
        KeyInsidePolygon shouldEqual "insidePolygon"
        KeyIgnorePlurals shouldEqual "ignorePlurals"
        KeyRemoveStopWords shouldEqual "removeStopWords"
        KeyCamelCaseAttributes shouldEqual "camelCaseAttributes"
        KeyDecompoundedAttributes shouldEqual "decompoundedAttributes"
        KeyKeepDiacriticsOnCharacters shouldEqual "keepDiacriticsOnCharacters"
        KeyQueryLanguages shouldEqual "queryLanguages"
        KeyEnableRules shouldEqual "enableRules"
        KeyRuleContexts shouldEqual "ruleContexts"
        KeyEnablePersonalization shouldEqual "enablePersonalization"
        KeyQueryType shouldEqual "queryType"
        KeyRemoveWordsIfNoResults shouldEqual "removeWordsIfNoResults"
        KeyAdvancedSyntax shouldEqual "advancedSyntax"
        KeyOptionalWords shouldEqual "optionalWords"
        KeyDisablePrefixOnAttributes shouldEqual "disablePrefixOnAttributes"
        KeyDisableExactOnAttributes shouldEqual "disableExactOnAttributes"
        KeyExactOnSingleWordQuery shouldEqual "exactOnSingleWordQuery"
        KeyAlternativesAsExact shouldEqual "alternativesAsExact"
        KeyNumericAttributesForFiltering shouldEqual "numericAttributesForFiltering"
        KeyAllowCompressionOfIntegerArray shouldEqual "allowCompressionOfIntegerArray"
        KeyAttributeForDistinct shouldEqual "attributeForDistinct"
        KeyDistinct shouldEqual "distinct"
        KeyGetRankingInfo shouldEqual "getRankingInfo"
        KeyClickAnalytics shouldEqual "clickAnalytics"
        KeyAnalytics shouldEqual "analytics"
        KeyAnalyticsTags shouldEqual "analyticsTags"
        KeySynonyms shouldEqual "synonyms"
        KeyReplaceSynonymsInHighlight shouldEqual "replaceSynonymsInHighlight"
        KeyMinProximity shouldEqual "minProximity"
        KeyResponseFields shouldEqual "responseFields"
        KeyMaxFacetHits shouldEqual "maxFacetHits"
        KeyPercentileComputation shouldEqual "percentileComputation"
        KeyGeo shouldEqual "geo"
        KeyTypo shouldEqual "typo"
        KeyWords shouldEqual "words"
        KeyProximity shouldEqual "proximity"
        KeyAttribute shouldEqual "attribute"
        KeyExact shouldEqual "exact"
        KeyCustom shouldEqual "custom"
        KeyAsc shouldEqual "asc"
        KeyDesc shouldEqual "desc"
        KeyStrict shouldEqual "strict"
        KeyMin shouldEqual "min"
        KeySingleWordSynonym shouldEqual "singleWordSynonym"
        KeyMultiWordsSynonym shouldEqual "multiWordsSynonym"
        KeyAll shouldEqual "all"
        KeyWord shouldEqual "word"
        KeyNone shouldEqual "none"
        KeyStopIfEnoughMatches shouldEqual "stopIfEnoughMatches"
        KeyPrefixLast shouldEqual "prefixLast"
        KeyPrefixAll shouldEqual "prefixAll"
        KeyPrefixNone shouldEqual "prefixNone"
        KeyLastWords shouldEqual "lastWords"
        KeyFirstWords shouldEqual "firstWords"
        KeyAllOptional shouldEqual "allOptional"
        KeyStar shouldEqual "*"
        KeyAutomaticRadius shouldEqual "automaticRadius"
        KeyExhaustiveFacetsCount shouldEqual "exhaustiveFacetsCount"
        KeyFacetsStats shouldEqual "facets_stats"
        KeyHits shouldEqual "hits"
        KeyIndex shouldEqual "indexName"
        KeyNbHits shouldEqual "nbHits"
        KeyNbPages shouldEqual "nbPages"
        KeyParams shouldEqual "params"
        KeyProcessingTimeMS shouldEqual "processingTimeMS"
        KeyQueryAfterRemoval shouldEqual "queryAfterRemoval"
        KeyUserData shouldEqual "userData"
        KeyCount shouldEqual "count"
        KeyAlpha shouldEqual "alpha"
        KeyEqualOnly shouldEqual "equalOnly"
        KeyFacetQuery shouldEqual "facetQuery"
        KeyStrategy shouldEqual "strategy"
        KeyRequests shouldEqual "requests"
        KeyIndexName shouldEqual "indexName"
        KeyPublished shouldEqual "published"
        KeyNotPublished shouldEqual "notPublished"
        KeyStatus shouldEqual "status"
        KeyOperation shouldEqual "operation"
        KeyDestination shouldEqual "destination"
        KeyCopy shouldEqual "copy"
        KeyMove shouldEqual "move"
        KeyRules shouldEqual "rules"
        KeySettings shouldEqual "settings"
        KeyScope shouldEqual "scope"
        KeyCursor shouldEqual "cursor"
        KeyPartial shouldEqual "partial"
        KeyFull shouldEqual "full"
        KeyCreateIfNotExists shouldEqual "createIfNotExists"
        KeyIncrement shouldEqual "Increment"
        KeyDecrement shouldEqual "Decrement"
        KeyAdd shouldEqual "Add"
        KeyRemove shouldEqual "Remove"
        KeyAddUnique shouldEqual "AddUnique"
        Key_Operation shouldEqual "_operation"
        KeyValue shouldEqual "value"
        KeyObjectId shouldEqual "objectID"
        KeyIndex_Name shouldEqual "index_name"

        KeyAfrikaans shouldEqual "af"
        KeyArabic shouldEqual "ar"
        KeyAzeri shouldEqual "az"
        KeyBulgarian shouldEqual "bg"
        KeyBrunei shouldEqual "bn"
        KeyCatalan shouldEqual "ca"
        KeyCzech shouldEqual "cs"
        KeyWelsh shouldEqual "cy"
        KeyDanish shouldEqual "da"
        KeyGerman shouldEqual "de"
        KeyEnglish shouldEqual "en"
        KeyEsperanto shouldEqual "eo"
        KeySpanish shouldEqual "es"
        KeyEstonian shouldEqual "et"
        KeyBasque shouldEqual "eu"
        KeyFinnish shouldEqual "fi"
        KeyFaroese shouldEqual "fo"
        KeyFrench shouldEqual "fr"
        KeyGalician shouldEqual "gl"
        KeyHebrew shouldEqual "he"
        KeyHindi shouldEqual "hi"
        KeyHungarian shouldEqual "hu"
        KeyArmenian shouldEqual "hy"
        KeyIndonesian shouldEqual "id"
        KeyIcelandic shouldEqual "is"
        KeyItalian shouldEqual "it"
        KeyJapanese shouldEqual "ja"
        KeyGeorgian shouldEqual "ka"
        KeyKazakh shouldEqual "kk"
        KeyKorean shouldEqual "ko"
        KeyKyrgyz shouldEqual "ky"
        KeyLithuanian shouldEqual "lt"
        KeyMaori shouldEqual "mi"
        KeyMongolian shouldEqual "mn"
        KeyMarathi shouldEqual "mr"
        KeyMalay shouldEqual "ms"
        KeyMaltese shouldEqual "mt"
        KeyNorwegian shouldEqual "nb"
        KeyDutch shouldEqual "nl"
        KeyNorthernSotho shouldEqual "ns"
        KeyPolish shouldEqual "pl"
        KeyPashto shouldEqual "ps"
        KeyPortuguese shouldEqual "pt"
        KeyQuechua shouldEqual "qu"
        KeyRomanian shouldEqual "ro"
        KeyRussian shouldEqual "ru"
        KeySlovak shouldEqual "sk"
        KeyAlbanian shouldEqual "sq"
        KeySwedish shouldEqual "sv"
        KeySwahili shouldEqual "sw"
        KeyTamil shouldEqual "ta"
        KeyTelugu shouldEqual "te"
        KeyTagalog shouldEqual "tl"
        KeyTswana shouldEqual "tn"
        KeyTurkish shouldEqual "tr"
        KeyTatar shouldEqual "tt"
    }
}