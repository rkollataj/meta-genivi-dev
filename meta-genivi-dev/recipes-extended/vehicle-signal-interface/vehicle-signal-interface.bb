SUMMARY = "Vehicle Signal Interface"
DESCRIPTION = "VSI written in C"
HOMEPAGE = "https://github.com/GENIVI/vehicle_signal_interface"
SECTION = "base"

LICENSE="GPL2.0"

inherit cmake

S = "${WORKDIR}/git"

SRCREV = "64f3ef1530841930fbf4d8b5f41627cf25eb7748"

SRC_URI = " \
    git://github.com/rkollataj/vehicle_signal_interface.git;branch=cmake \
    "
SRC_URI[sha256sum] = "31e73d3245eff8d5b7839fd7ccf760df781938fdf37aca299df9689ccbf4594b"

DEPENDS = "python3 lua"

