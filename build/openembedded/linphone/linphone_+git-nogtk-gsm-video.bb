## THIS unusable work in progress ##

DESCRIPTION = "Audio/video SIP-based IP phone (console edition)"
HOMEPAGE = "http://www.linphone.org/?lang=us"
LICENSE = "GPLv2"
PR="r14"

DEFAULT_PREFERENCE = "3"
OVERRIDES_append = ":console"
OVERRIDES_append = ":gsm"
OVERRIDES_append = ":video"

#PARALLEL_MAKE="V=1"

require linphone-common_git.inc
