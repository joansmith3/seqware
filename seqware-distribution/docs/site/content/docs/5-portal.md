---

title:                 "SeqWare Portal"
toc_includes_sections: true
markdown:              advanced

---

<!--
TODO:
* need to show cluster launching through portal
-->

## Overview

This web application is used to track the processing of SeqWare sequence data
through the SeqWare-supplied pipeline, alignment to a reference genome, and
report generation.

It is part of the larger SeqWare project that looks to streamline the
manipulation of sequence data produced by next gen sequencers.  The SeqWare
LIMS system is closely tied with the SeqWare Pipeline software that controls
the actual processing, alignment, and annotation of sequence data.  SeqWare
LIMS collects various bits of metadata related to each flowcell and lane used
in the sequencer and passes this information via a common database backend to
the SeqWare Pipeline software.

<p class="warning"><strong>Warning:</strong>
The SeqWare Portal is not currently in production use and is unmaintained in favour of 
the command-line tools. We are currently working on a replacement so use at your own risk. 
</p>

SeqWare Pipeline then records the status of each step in the processing
pipeline back to the database.  These "processing" messages are then displayed
in the LIMS system.  This makes it very easy for researchers to both follow the
progress of a particular run and also get back to the reports automatically
created based on their initial settings.

See the [User Guide](/docs/5-portal/user-guide/) for examples of
how to use the Portal for setting up Samples, Experiments, Studies, and
uploading data for use by workflows.

## Building and Installing

Most users will want to use our pre-configured VMs, see the [SeqWare Install
Guide](/docs/2-installation/) for how to get the VM.  Please see the [Install
Guide](/docs/github_readme/5-portal/) for building and installing the SeqWare
Portal.

<!--
## Features

## Uploading Data

## Launching Workflows

## Monitoring Workflows

## Retrieving Results

## Tomcat Config File

Document the config settings for Tomcat like email addresses, DB, etc
-->
