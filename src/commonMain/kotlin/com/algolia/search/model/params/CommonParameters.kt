package com.algolia.search.model.params

import com.algolia.search.model.search.Language
import com.algolia.search.model.search.Snippet

public interface CommonParameters : BaseParameters {

    /**
     * List of attributes to snippet.
     * Engine default: []
     * [Documentation][https://www.algolia.com/doc/api-reference/api-parameters/attributesToSnippet/?language=kotlin]
     */
    public var attributesToSnippet: List<Snippet>?

    /**
     * Set the number of hits per page.
     * Engine default: 20
     * [Documentation][https://www.algolia.com/doc/api-reference/api-parameters/hitsPerPage/?language=kotlin]
     */
    public var hitsPerPage: Int?

    /**
     * Sets the languages to be used by language-specific settings and functionalities such as [ignorePlurals],
     * [removeStopWords], and [CJK word-detection][https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#using-a-language-specific-dictionary-for-cjk-words].
     * Engine default: []
     * [Documentation][https://www.algolia.com/doc/api-reference/api-parameters/queryLanguages/?language=kotlin]
     */
    public var queryLanguages: List<Language>?
}
