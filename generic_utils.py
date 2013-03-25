# Copyright 2013, Big Switch Networks, Inc.
#
# LoxiGen is licensed under the Eclipse Public License, version 1.0 (EPL), with
# the following special exception:
#
# LOXI Exception
#
# As a special exception to the terms of the EPL, you may distribute libraries
# generated by LoxiGen (LoxiGen Libraries) under the terms of your choice, provided
# that copyright and licensing notices generated by LoxiGen are not altered or removed
# from the LoxiGen Libraries and the notice provided below is (i) included in
# the LoxiGen Libraries, if distributed in source code form and (ii) included in any
# documentation for the LoxiGen Libraries, if distributed in binary form.
#
# Notice: "Copyright 2013, Big Switch Networks, Inc. This library was generated by the LoxiGen Compiler."
#
# You may not use this file except in compliance with the EPL or LOXI Exception. You may obtain
# a copy of the EPL at:
#
# http://www.eclipse.org/legal/epl-v10.html
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
# WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
# EPL for the specific language governing permissions and limitations
# under the EPL.

"""
@brief Generic utilities

Intended to be imported into another namespace
"""

import sys
import of_g


################################################################
#
# Configuration related
#
################################################################

def config_check(str, dictionary = of_g.code_gen_config):
    """
    Return config value if in dictionary; else return False.
    @param str The lookup index
    @param dictionary The dict to check; use code_gen_config if None
    """

    if str in dictionary:
        return dictionary[str]

    return False

################################################################
#
# Debug
#
################################################################

def debug(obj):
    """
    Debug output to the current both the log file and debug output
    @param out_str The stringified output to write
    """
    of_g.loxigen_dbg_file.write(str(obj) + "\n")
    log(obj)

def log(obj):
    """
    Log output to the current global log file
    @param out_str The stringified output to write
    """
    of_g.loxigen_log_file.write(str(obj) + "\n")