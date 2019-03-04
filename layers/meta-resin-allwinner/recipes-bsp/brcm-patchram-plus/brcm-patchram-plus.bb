DESCRIPTION = ""
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/balena-os/brcm_patchram_plus"
SRCREV = "6ca3a2dcf28f5a3c3cc9c127daa153004753ad32"

S = "${WORKDIR}/git"

do_install() {
    mkdir -p ${D}/${bindir}/
    install -m 0700 ${B}/brcm_patchram_plus ${D}/${bindir}/
}

FILES_${PN} = "/usr/bin/brcm_patchram_plus"
