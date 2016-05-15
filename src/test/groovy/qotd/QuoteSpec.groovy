package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }
  
    def "test for valid quote text"() {
      when: 'text is empty'
      def p = new Quote(text: '')
      
      then: 'validation should fail'
      !p.validate()
      
      when: 'text is null'
      def p2 = new Quote(text: null)
      
      then: 'validation should fail'
      !p2.validate()
      
      when: 'text is legal text'
      def p3 = new Quote(text: 'some valid text')
      
      then: 'validation should pass'
      p3.validate()
    } 
}
