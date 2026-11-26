// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeSheetState } from "./shared";
import type { ComposeWindowInsets } from "../../utils/composeValues";

export type BottomSheetProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeSheetState;
    onDismissRequest?: () => void;
    maxWidth?: number;
    gesturesEnabled?: boolean;
    backHandlerEnabled?: boolean;
    dragHandle?: ReactNode;
    shape?: ComposeShape;
    shadowElevation?: number;
    children?: ReactNode;
    contentWindowInsets?: never;
    containerColor?: never;
    contentColor?: never;
    tonalElevation?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeSheetState;
    onDismissRequest?: () => void;
    maxWidth?: number;
    gesturesEnabled?: boolean;
    backHandlerEnabled?: boolean;
    dragHandle?: ReactNode;
    shape?: ComposeShape;
    tonalElevation: number;
    children?: ReactNode;
    contentWindowInsets?: never;
    containerColor?: never;
    contentColor?: never;
    shadowElevation?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeSheetState;
    onDismissRequest?: () => void;
    maxWidth?: number;
    gesturesEnabled?: boolean;
    backHandlerEnabled?: boolean;
    dragHandle?: ReactNode;
    shape?: ComposeShape;
    contentColor: string;
    children?: ReactNode;
    contentWindowInsets?: never;
    containerColor?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeSheetState;
    onDismissRequest?: () => void;
    maxWidth?: number;
    gesturesEnabled?: boolean;
    backHandlerEnabled?: boolean;
    dragHandle?: ReactNode;
    shape?: ComposeShape;
    containerColor: string;
    children?: ReactNode;
    contentWindowInsets?: never;
    contentColor?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeSheetState;
    onDismissRequest?: () => void;
    maxWidth?: number;
    gesturesEnabled?: boolean;
    backHandlerEnabled?: boolean;
    dragHandle?: ReactNode;
    contentWindowInsets: ComposeWindowInsets;
    shadowElevation?: number;
    children?: ReactNode;
    shape?: never;
    containerColor?: never;
    contentColor?: never;
    tonalElevation?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeSheetState;
    onDismissRequest?: () => void;
    maxWidth?: number;
    gesturesEnabled?: boolean;
    backHandlerEnabled?: boolean;
    dragHandle?: ReactNode;
    contentWindowInsets: ComposeWindowInsets;
    tonalElevation: number;
    children?: ReactNode;
    shape?: never;
    containerColor?: never;
    contentColor?: never;
    shadowElevation?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeSheetState;
    onDismissRequest?: () => void;
    maxWidth?: number;
    gesturesEnabled?: boolean;
    backHandlerEnabled?: boolean;
    dragHandle?: ReactNode;
    contentWindowInsets: ComposeWindowInsets;
    contentColor: string;
    children?: ReactNode;
    shape?: never;
    containerColor?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeSheetState;
    onDismissRequest?: () => void;
    maxWidth?: number;
    gesturesEnabled?: boolean;
    backHandlerEnabled?: boolean;
    dragHandle?: ReactNode;
    contentWindowInsets: ComposeWindowInsets;
    containerColor: string;
    children?: ReactNode;
    shape?: never;
    contentColor?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeSheetState;
    onDismissRequest?: () => void;
    maxWidth?: number;
    gesturesEnabled?: boolean;
    backHandlerEnabled?: boolean;
    dragHandle?: ReactNode;
    contentWindowInsets: ComposeWindowInsets;
    shape: ComposeShape;
    children?: ReactNode;
    containerColor?: never;
    contentColor?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeSheetState;
    onDismissRequest: () => void;
    maxWidth: number;
    gesturesEnabled: boolean;
    backHandlerEnabled: boolean;
    dragHandle: ReactNode;
    contentWindowInsets?: ComposeWindowInsets;
    shape: ComposeShape;
    containerColor: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    children?: ReactNode;
    }
;
export const BottomSheet = createComposableComponent<BottomSheetProps>({
  name: "BottomSheet",
  props: ["modifier","state","maxWidth","gesturesEnabled","backHandlerEnabled","contentWindowInsets","shape","containerColor","contentColor","tonalElevation","shadowElevation"],
  objectProps: ["state","contentWindowInsets","shape"],
  slots: ["dragHandle"],
  events: ["onDismissRequest"],
  children: true,
  overloads: [
    { id: "BottomSheet", children: true, parameters: [["modifier","ComposeModifier",true,false],["state","object",true,false],["onDismissRequest","function",true,false],["maxWidth","number",true,false],["gesturesEnabled","boolean",true,false],["backHandlerEnabled","boolean",true,false],["dragHandle","ReactNode",true,true],["contentWindowInsets","object",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377,378,379,380,381,382,383,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420,421,422,423,424,425,426,427,428,429,430,431,432,433,434,435,436,437,438,439,440,441,442,443,444,445,446,447,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,644,645,646,647,648,649,650,651,652,653,654,655,656,657,658,659,660,661,662,663,664,665,666,667,668,669,670,671,672,673,674,675,676,677,678,679,680,681,682,683,684,685,686,687,688,689,690,691,692,693,694,695,696,697,698,699,700,701,702,703,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,1088,1089,1090,1091,1092,1093,1094,1095,1096,1097,1098,1099,1100,1101,1102,1103,1104,1105,1106,1107,1108,1109,1110,1111,1112,1113,1114,1115,1116,1117,1118,1119,1120,1121,1122,1123,1124,1125,1126,1127,1128,1129,1130,1131,1132,1133,1134,1135,1136,1137,1138,1139,1140,1141,1142,1143,1144,1145,1146,1147,1148,1149,1150,1151,1152,1153,1154,1155,1156,1157,1158,1159,1160,1161,1162,1163,1164,1165,1166,1167,1168,1169,1170,1171,1172,1173,1174,1175,1176,1177,1178,1179,1180,1181,1182,1183,1184,1185,1186,1187,1188,1189,1190,1191,1192,1193,1194,1195,1196,1197,1198,1199,1200,1201,1202,1203,1204,1205,1206,1207,1208,1209,1210,1211,1212,1213,1214,1215,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,2176,2177,2178,2179,2180,2181,2182,2183,2184,2185,2186,2187,2188,2189,2190,2191,2192,2193,2194,2195,2196,2197,2198,2199,2200,2201,2202,2203,2204,2205,2206,2207,2208,2209,2210,2211,2212,2213,2214,2215,2216,2217,2218,2219,2220,2221,2222,2223,2224,2225,2226,2227,2228,2229,2230,2231,2232,2233,2234,2235,2236,2237,2238,2239,4031,4095] },
  ],
});
