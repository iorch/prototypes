#!/usr/bin/env ruby
# encoding: utf-8

require 'java'
import javax.xml.namespace.QName
require 'lib/todos/XmlSchema-1.4.7.jar'
require 'lib/todos/activation-1.1.jar'
require 'lib/todos/axiom-api-1.2.13.jar'
require 'lib/todos/axiom-impl-1.2.13.jar'
require 'lib/todos/axis2-adb-1.6.2.jar'
require 'lib/todos/axis2-kernel-1.6.2.jar'
require 'lib/todos/axis2-transport-http-1.6.2.jar'
require 'lib/todos/axis2-transport-local-1.6.2.jar'
require 'lib/todos/commons-codec-1.3.jar'
require 'lib/todos/commons-httpclient-3.1.jar'
require 'lib/todos/commons-logging-1.1.1.jar'
require 'lib/todos/dom4j-1.6.1.jar'
require 'lib/todos/httpcore-4.0.jar'
require 'lib/todos/mail-1.4.jar'
require 'lib/todos/neethi-3.0.2.jar'
require 'lib/todos/wsdl4j-1.6.2.jar'

class ClienteConsultaPorCurp
    def get_session_id(xml)
    session_id = ""
        begin
            doc = DocumentHelper.parserText(xml)
            attr = doc.getRootElement.attribute("session_id")
            session_id = attr.getText
            rescue
            puts "no session_id"
        end
        session_id
    end
end