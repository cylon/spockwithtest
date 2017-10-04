package com.github

import spock.lang.Specification


class SpockWithTest extends Specification {

    def 'deeply nested with blocks'() {
        def nestedLists = [[[['end']]]]
        expect:
        with(nestedLists) {
            with(it[0]) {
                with(it[0]) {
                    with(it[0]) {
                        with(it[0]) {
                            it == 'end'
                        }
                    }
                }
            }
        }
    }
}