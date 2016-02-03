VHDLDesignFile ::= VHDLDesignUnit+

VHDLDesignUnit ::= VHDLContextItem*
                   VHDLLibraryUnit

VHDLContextItem ::= VHDLLibraryClause | VHDLUseClause

VHDLLibraryClause ::= "library" VHDLLogicalName["," VHDLLogicalName]* ";"

VHDLLogicalName ::= identifier{String}

VHDLUseClause ::= "use" VHDLSelectedName["," VHDLSelectedName]* ";"

VHDLSelectedName ::= name{String}

VHDLLibraryUnit ::= VHDLPrimaryUnit | VHDLSecondaryUnit

VHDLPrimaryUnit ::= VHDLEntityDeclaration

VHDLEntityDeclaration ::= "entity" identifier{String} "is"
                             ["port(" VHDLInterfaceList ")"]
                             VHDLEntityDeclarativeItem*
                          "end"        
VHDLInterfaceList ::= VHDLInterfaceElement{";" VHDLInterfaceElement}

VHDLInterfaceElement ::= VHDLInterfaceSignalDeclaration

VHDLInterfaceSignalDeclaration ::= ["signal"] identifier{String} : [VHDLMode] VHDLSubtypeIndication

VHDLMode ::= "IN" | "OUT" | "INOUT"

VHDLSubtypeIndication ::= name{String}

VHDLEntityDeclarativeItem ::= VHDLTypeDeclaration

VHDLTypeDeclaration ::= VHDLFullTypeDeclaration

VHDLFullTypeDeclaration ::= "type" identifier{String} "is" VHDLTypeDefinition

VHDLTypeDefinition ::= VHDLScalarTypeDefinition

VHDLScalarTypeDefinition ::= VHDLEnumerationTypeDefinition

VHDLEnumerationTypeDefinition ::= "(" VHDLEnumerationLiteral+ ")"

VHDLEnumerationLiteral ::= name{String}

VHDLSecondaryUnit ::= VHDLArchitectureBody

VHDLArchitectureBody ::= "architecture" identifier{String} "of" name{String} "is"
                           VHDLBlockDeclarativeItem*
                        "begin"
                           VHDLConcurrentStatement*
                        "end";

VHDLBlockDeclarativeItem ::= VHDLTypeDeclaration | VHDLInterfaceSignalDeclaration

VHDLConcurrentStatement ::= VHDLProcessStatement

VHDLProcessStatement ::= "process" "(" VHDLSignalName{, VHDLSignalName}* ")" "is"
                            VHDLProcessDeclarativeItem*
                         "begin"
                            VHDLSequentialStatement*
                         "end" "process"

VHDLSignalName ::= name{String}
                         
VHDLProcessDeclarativeItem ::= VHDLTypeDeclaration

VHDLSequentialStatement ::= VHDLAssertionStatement |
                            VHDLSignalAssignmentStatement |
                            VHDLIfStatement |
                            VHDLCaseStatement |

VHDLAssertionStatement ::= [label{String}":" ] VHDLAssertion;

VHDLAssertion ::= "assert" boolean expression{String}

VHDLSignalAssignmentStatement ::= target{String} "<=" waveform{String}

VHDLIfStatement ::= VHDLIfClause
                    VHDLElsifClause*
                    [VHDLElseClause]
                    "end if"

VHDLIfClause ::= "if" boolean expression{String} "then"
                    VHDLSequentialStatement*
                    
VHDLElsifClause ::= "elsif" boolean expression "then"
                       VHDLSequentialStatement*

VHDLElseClause ::= "else"
                      VHDLSequentialStatement*

VHDLCaseStatement ::= "case" expression{String} "is"
                         VHDLCaseStatementAlternative+
                      "end case"
                      
VHDLCaseStatementAlternative ::= "when" choices{String} =>
                                    VHDLSequentialStatement*