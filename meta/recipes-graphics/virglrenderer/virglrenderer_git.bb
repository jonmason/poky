SUMMARY = "VirGL virtual OpenGL renderer"
HOMEPAGE = "https://virgil3d.github.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=c81c08eeefd9418fca8f88309a76db10"

DEPENDS = "libdrm mesa libepoxy"
PV = "0.7.0"
SRCREV = "402c228861c9893f64cffbbcb4cb23044b8c721c"
SRC_URI = "git://anongit.freedesktop.org/virglrenderer"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

BBCLASSEXTEND = "native nativesdk"

