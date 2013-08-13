#!/usr/bin/ruby

require 'rubygems'
require 'IfeInfo'

my_ife=IfeInfo.new
ife_hash=Hash.new
ife_hash["clave_del_elector"]   = my_ife.get_clave_del_elector
ife_hash["numero_de_emision"]   = my_ife.get_numero_de_emision
ife_hash["numero_vertical_ocr"] = my_ife.get_numero_vertical_ocr

#ife_hash["clave_del_elector"]   = "DLCRLN83110914H100"
ife_hash["numero_de_emision"] = "01"

File.open('navigate_ife.txt', 'w') do |f1| 

    f1.puts "# Command logfile created by Lynx 2.8.7rel.2 (21 Jun 2010)"
    f1.puts "# Arg0 = lynx"
    f1.puts "# Arg1 = -cmd_script=navigate_ife.txt"
    f1.puts "# Arg2 = -cmd_log=log.log "
    f1.puts "# Arg3 = http://listanominal.ife.org.mx/"
    f1.puts "key Down Arrow"
    f1.puts "key Down Arrow"
    ife_hash["clave_del_elector"].each_char do |char|
        f1.puts "key #{char}"
    end
    f1.puts "key Down Arrow"
    ife_hash["numero_de_emision"].each_char do |char|
        f1.puts "key #{char}"
    end
    f1.puts "key Down Arrow"
    ife_hash["numero_vertical_ocr"].each_char do |char|
        f1.puts "key #{char}"
    end
    f1.puts "key ^J"
    f1.puts "key ^J"
    f1.puts "key ^<FF>"
    f1.puts "key p"
    f1.puts "key ^J"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    f1.puts "key <delete>"
    ife_hash["clave_del_elector"].each_char do |char|
        f1.puts "key #{char}"
    end
    "_verify.tmp".each_char do |char|
        f1.puts "key #{char}"
    end
    f1.puts "key ^J"
    f1.puts "key q"
    f1.puts "key q"
end

value = %x( lynx -cmd_script=navigate_ife.txt -cmd_log=print.txt http://listanominal.ife.org.mx/ )
cmd="grep \".jpg]\" #{ife_hash["clave_del_elector"]}_verify.tmp|grep -v \"emision_imagen\" |grep -v \"ife\"|sed 's/ //g;s/\\\[//;s/.jpg\\\]//'"
ife_verification_result = %x[ #{cmd} ]
cmd = "rm #{ife_hash["clave_del_elector"]}_verify.tmp"
wasGood = system( cmd )
puts ife_verification_result

