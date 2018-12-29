package client.serialize


internal const val KeyQuery = "query"
internal const val KeySearchableAttributes = "searchableAttributes"
internal const val KeyAttributesForFaceting = "attributesForFaceting"
internal const val KeyUnretrievableAttributes = "UnretrievableAttributes"
internal const val KeyAttributesToRetrieve = "attributesToRetrieve"
internal const val KeyRestrictSearchableAttributes = "restrictSearchableAttributes"
internal const val KeyRanking = "ranking"
internal const val KeyCustomRanking = "customRanking"
internal const val KeyReplicas = "replicas"
internal const val KeyFilters = "filters"
internal const val KeyFacetFilters = "facetFilters"
internal const val KeyOptionalFilters = "optionalFilters"
internal const val KeyNumericFilters = "numericFilters"
internal const val KeyTagFilters = "tagFilters"
internal const val KeySumOrFiltersScores = "sumOrFiltersScores"
internal const val KeyFacets = "facets"
internal const val KeyMaxValuesPerFacet = "maxValuesPerFacet"
internal const val KeyFacetingAfterDistinct = "facetingAfterDistinct"
internal const val KeySortFacetValuesBy = "sortFacetValuesBy"
internal const val KeyAttributesToHighlight = "attributesToHighlight"
internal const val KeyAttributesToSnippet = "attributesToSnippet"
internal const val KeyHighlightPreTag = "highlightPreTag"
internal const val KeyHighlightPostTag = "highlightPostTag"
internal const val KeySnippetEllipsisText = "snippetEllipsisText"
internal const val KeyRestrictHighlightAndSnippetArrays = "restrictHighlightAndSnippetArrays"
internal const val KeyPage = "page"
internal const val KeyHitsPerPage = "hitsPerPage"
internal const val KeyOffset = "offset"
internal const val KeyLength = "length"
internal const val KeyPaginationLimitedTo = "paginationLimitedTo"
internal const val KeyMinWordSizefor1Typo = "minWordSizefor1Typo"
internal const val KeyMinWordSizefor2Typos = "minWordSizefor2Typos"
internal const val KeyTypoTolerance = "typoTolerance"
internal const val KeyAllowTyposOnNumericTokens = "allowTyposOnNumericTokens"
internal const val KeyDisableTypoToleranceOnAttributes = "disableTypoToleranceOnAttributes"
internal const val KeyDisableTypoToleranceOnWords = "disableTypoToleranceOnWords"
internal const val KeySeparatorsToIndex = "separatorsToIndex"
internal const val KeyAroundLatLng = "aroundLatLng"
internal const val KeyAroundLatLngViaIP = "aroundLatLngViaIP"
internal const val KeyAroundRadius = "aroundRadius"
internal const val KeyAroundPrecision = "aroundPrecision"
internal const val KeyMinimumAroundRadius = "minimumAroundRadius"
internal const val KeyInsideBoundingBox = "insideBoundingBox"
internal const val KeyInsidePolygon = "insidePolygon"
internal const val KeyIgnorePlurals = "ignorePlurals"
internal const val KeyRemoveStopWords = "removeStopWords"
internal const val KeyCamelCaseAttributes = "camelCaseAttributes"
internal const val KeyDecompoundedAttributes = "decompoundedAttributes"
internal const val KeyKeepDiacriticsOnCharacters = "keepDiacriticsOnCharacters"
internal const val KeyQueryLanguages = "queryLanguages"
internal const val KeyEnableRules = "enableRules"
internal const val KeyRuleContexts = "ruleContexts"
internal const val KeyEnablePersonalization = "enablePersonalization"
internal const val KeyQueryType = "queryType"
internal const val KeyRemoveWordsIfNoResults = "removeWordsIfNoResults"
internal const val KeyAdvancedSyntax = "advancedSyntax"
internal const val KeyOptionalWords = "optionalWords"
internal const val KeyDisablePrefixOnAttributes = "disablePrefixOnAttributes"
internal const val KeyDisableExactOnAttributes = "disableExactOnAttributes"
internal const val KeyExactOnSingleWordQuery = "exactOnSingleWordQuery"
internal const val KeyAlternativesAsExact = "alternativesAsExact"
internal const val KeyNumericAttributesForFiltering = "numericAttributesForFiltering"
internal const val KeyAllowCompressionOfIntegerArray = "allowCompressionOfIntegerArray"
internal const val KeyAttributeForDistinct = "attributeForDistinct"
internal const val KeyDistinct = "distinct"
internal const val KeyGetRankingInfo = "getRankingInfo"
internal const val KeyClickAnalytics = "clickAnalytics"
internal const val KeyAnalytics = "analytics"
internal const val KeyAnalyticsTags = "analyticsTags"
internal const val KeySynonyms = "synonyms"
internal const val KeyReplaceSynonymsInHighlight = "replaceSynonymsInHighlight"
internal const val KeyMinProximity = "minProximity"
internal const val KeyResponseFields = "responseFields"
internal const val KeyMaxFacetHits = "maxFacetHits"
internal const val KeyPercentileComputation = "percentileComputation"
internal const val KeyGeo = "geo"
internal const val KeyTypo = "typo"
internal const val KeyWords = "words"
internal const val KeyProximity = "proximity"
internal const val KeyAttribute = "attribute"
internal const val KeyExact = "exact"
internal const val KeyCustom = "custom"
internal const val KeyAsc = "asc"
internal const val KeyDesc = "desc"
internal const val KeyStrict = "strict"
internal const val KeyMin = "min"
internal const val KeySingleWordSynonym = "singleWordSynonym"
internal const val KeyMultiWordsSynonym = "multiWordsSynonym"
internal const val KeyAll = "all"
internal const val KeyWord = "word"
internal const val KeyNone = "none"
internal const val KeyStopIfEnoughMatches = "stopIfEnoughMatches"
internal const val KeyPrefixLast = "prefixLast"
internal const val KeyPrefixAll = "prefixAll"
internal const val KeyPrefixNone = "prefixNone"
internal const val KeyLastWords = "lastWords"
internal const val KeyFirstWords = "firstWords"
internal const val KeyAllOptional = "allOptional"
internal const val KeyStar = "*"
internal const val KeyAutomaticRadius = "automaticRadius"
internal const val KeyExhaustiveFacetsCount = "exhaustiveFacetsCount"
internal const val KeyFacetsStats = "facets_stats"
internal const val KeyHits = "hits"
internal const val KeyIndex = "index"
internal const val KeyNbHits = "nbHits"
internal const val KeyNbPages = "nbPages"
internal const val KeyParams = "params"
internal const val KeyProcessingTimeMS = "processingTimeMS"
internal const val KeyQueryAfterRemoval = "queryAfterRemoval"
internal const val KeyUserData = "userData"
internal const val KeyCount = "count"
internal const val KeyAlpha = "alpha"
internal const val KeyEqualOnly = "equalOnly"
internal const val KeyFacetQuery = "facetQuery"
internal const val KeyStrategy = "strategy"
internal const val KeyRequests = "requests"
internal const val KeyIndexName = "indexName"
internal const val KeyForwardToReplicas = "forwardToReplicas"

internal const val KeyAfrikaans = "af"
internal const val KeyArabic = "ar"
internal const val KeyAzeri = "az"
internal const val KeyBulgarian = "bg"
internal const val KeyBrunei = "bn"
internal const val KeyCatalan = "ca"
internal const val KeyCzech = "cs"
internal const val KeyWelsh = "cy"
internal const val KeyDanish = "da"
internal const val KeyGerman = "de"
internal const val KeyEnglish = "en"
internal const val KeyEsperanto = "eo"
internal const val KeySpanish = "es"
internal const val KeyEstonian = "et"
internal const val KeyBasque = "eu"
internal const val KeyFinnish = "fi"
internal const val KeyFaroese = "fo"
internal const val KeyFrench = "fr"
internal const val KeyGalician = "gl"
internal const val KeyHebrew = "he"
internal const val KeyHindi = "hi"
internal const val KeyHungarian = "hu"
internal const val KeyArmenian = "hy"
internal const val KeyIndonesian = "id"
internal const val KeyIcelandic = "is"
internal const val KeyItalian = "it"
internal const val KeyJapanese = "ja"
internal const val KeyGeorgian = "ka"
internal const val KeyKazakh = "kk"
internal const val KeyKorean = "ko"
internal const val KeyKyrgyz = "ky"
internal const val KeyLithuanian = "lt"
internal const val KeyMaori = "mi"
internal const val KeyMongolian = "mn"
internal const val KeyMarathi = "mr"
internal const val KeyMalay = "ms"
internal const val KeyMaltese = "mt"
internal const val KeyNorwegian = "nb"
internal const val KeyDutch = "nl"
internal const val KeyNorthernSotho = "ns"
internal const val KeyPolish = "pl"
internal const val KeyPashto = "ps"
internal const val KeyPortuguese = "pt"
internal const val KeyQuechua = "qu"
internal const val KeyRomanian = "ro"
internal const val KeyRussian = "ru"
internal const val KeySlovak = "sk"
internal const val KeyAlbanian = "sq"
internal const val KeySwedish = "sv"
internal const val KeySwahili = "sw"
internal const val KeyTamil = "ta"
internal const val KeyTelugu = "te"
internal const val KeyTagalog = "tl"
internal const val KeyTswana = "tn"
internal const val KeyTurkish = "tr"
internal const val KeyTatar = "tt"
